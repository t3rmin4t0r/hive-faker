package org.notmysock.hive.udf;

import java.util.ArrayList;
import org.apache.hadoop.hive.ql.exec.Description;
import org.apache.hadoop.hive.ql.exec.UDFArgumentException;
import org.apache.hadoop.hive.ql.metadata.HiveException;
import org.apache.hadoop.hive.ql.udf.generic.GenericUDTF;
import org.apache.hadoop.hive.serde2.objectinspector.ConstantObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspectorFactory;
import org.apache.hadoop.hive.serde2.objectinspector.PrimitiveObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.PrimitiveObjectInspector.PrimitiveCategory;
import org.apache.hadoop.hive.serde2.objectinspector.StructObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector.Category;
import org.apache.hadoop.hive.serde2.objectinspector.primitive.IntObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.primitive.LongObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.primitive.PrimitiveObjectInspectorFactory;
import org.apache.hadoop.io.LongWritable;

@Description(name = "generate_series", value = "_FUNC_([start,] stop [,step]) "
    + "- generate an integer series")
public class GenerateSeriesUDTF extends GenericUDTF {

  private static final String[] argNames = { "start", "stop", "step" };

  private static boolean isNumericObjectInspector(ObjectInspector oi, boolean constant) {
    Category c = oi.getCategory();
    if (c != Category.PRIMITIVE) {
      return false;
    }
    PrimitiveCategory pc = ((PrimitiveObjectInspector) oi)
        .getPrimitiveCategory();

    if (pc != PrimitiveCategory.INT  && pc != PrimitiveCategory.LONG) {
      return false;
    }
    
    if (constant && !(oi instanceof ConstantObjectInspector)) {
      return false;
    }

    return true;
  }

  private transient ObjectInspector[] inputOIs; // input ObjectInspectors
  
  @Override
  public StructObjectInspector initialize(ObjectInspector[] ois)
      throws UDFArgumentException {
    switch (ois.length) {
    case 1:
    case 3:
    case 2:
      for (int i = 0; i < ois.length; i++) {
        if (!isNumericObjectInspector(ois[i], false)) {
          throw new UDFArgumentException(String.format(
              "The '%s' argument has to be an int/bigint - is '%s'", 
              argNames[i], ois[i]));
        }
      }
      break;
    default:
      throw new UDFArgumentException(
          "generate_series needs 2 or 3 arguments got " + ois.length
              + " arguments");
    }
    ArrayList<String> fieldNames = new ArrayList<String>(1);
    ArrayList<ObjectInspector> fieldOIs = new ArrayList<ObjectInspector>(1);
    fieldNames.add("seq_0");
    fieldOIs.add(PrimitiveObjectInspectorFactory.writableLongObjectInspector);
    this.inputOIs = ois;
    return ObjectInspectorFactory.getStandardStructObjectInspector(fieldNames,
        fieldOIs);
  }

  private long getArg(int i, Object[] args) {
    if (inputOIs[i] instanceof LongObjectInspector) {
      return (Long) ((LongObjectInspector) inputOIs[i])
          .getPrimitiveJavaObject(args[i]);
    } else {
      return (Integer) ((IntObjectInspector) inputOIs[i])
          .getPrimitiveJavaObject(args[i]);
    }
  }

  @Override
  public void process(Object[] args) throws HiveException {
    for (Object a : args) {
      if (a == null) {
        return;
      }
    }
    long start = 0;
    long stop = getArg(0, args);
    if (args.length > 1) {
      start = stop;
      stop = getArg(1, args);
    }
    long step = (start > stop) ? -1 : 1;
    if (args.length > 2) {
      step = getArg(2, args);
    }
    if (step > 0 && start > stop) {
      throw new HiveException(String.format("Cannot operate with step=%d, for [%d,%d) ", step, start, stop));
    }
    LongWritable[] row = new LongWritable[1];
    row[0] = new LongWritable();
    for (long i = start; i < stop; i += step) {
      row[0].set(i);
      forward(row);
    }
  }

  @Override
  public void close() throws HiveException {
    // stateless clean
  }

}
