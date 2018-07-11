package org.notmysock.hive.udf.faker;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;

import org.apache.hadoop.hive.common.type.HiveVarchar;
import org.apache.hadoop.hive.ql.exec.UDFArgumentException;
import org.apache.hadoop.hive.ql.metadata.HiveException;
import org.apache.hadoop.hive.ql.udf.generic.GenericUDTF;
import org.apache.hadoop.hive.serde2.objectinspector.ConstantObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector.Category;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspectorFactory;
import org.apache.hadoop.hive.serde2.objectinspector.PrimitiveObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.PrimitiveObjectInspector.PrimitiveCategory;
import org.apache.hadoop.hive.serde2.objectinspector.StructObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.primitive.IntObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.primitive.LongObjectInspector;
import org.apache.hadoop.hive.serde2.objectinspector.primitive.PrimitiveObjectInspectorFactory;
import org.apache.hadoop.hive.serde2.typeinfo.TypeInfoFactory;

import com.github.javafaker.Faker;

public abstract class AbstractGenericRowFakerBase extends GenericUDTF {

  private static final String[] argNames = { "seed", "rows" };

  private static boolean isNumericObjectInspector(ObjectInspector oi,
      boolean constant) {
    Category c = oi.getCategory();
    if (c != Category.PRIMITIVE) {
      return false;
    }
    PrimitiveCategory pc = ((PrimitiveObjectInspector) oi)
        .getPrimitiveCategory();

    if (pc != PrimitiveCategory.INT && pc != PrimitiveCategory.LONG) {
      return false;
    }

    if (constant && !(oi instanceof ConstantObjectInspector)) {
      return false;
    }

    return true;
  }

  private transient ObjectInspector[] inputOIs; // input ObjectInspectors
  
  private transient Faker faker;

  private transient Random random;
  
  protected Faker getFaker() {
    return this.faker;
  }

  @Override
  public StructObjectInspector initialize(ObjectInspector[] ois)
      throws UDFArgumentException {
    switch (ois.length) {
    case 1:
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
    this.inputOIs = ois;
    
    ArrayList<String> fieldNames = getFieldNames();
    ArrayList<ObjectInspector> fieldOIs = getFieldInspectors();

    this.random = new Random(0); // setSeed every row-group
    this.faker = new Faker(random);

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
    long seed = getArg(0, args);
    int rows = 1;
    if (args.length > 1) {
      rows = (int) getArg(1, args);
    }
    
    this.random.setSeed(seed);

    for (int i = 0; i < rows; i++) {
      forward(getRow());
    }
  }
  

  @Override
  public void close() throws HiveException {
    // nothing?
  }

  protected abstract Object getRow() throws HiveException;

  protected abstract ArrayList<String> getFieldNames();
  protected abstract ArrayList<ObjectInspector> getFieldInspectors();
  
  public ObjectInspector genOI_DATE() { return PrimitiveObjectInspectorFactory.javaDateObjectInspector;}
  public ObjectInspector genOI_TIMESTAMP() { return PrimitiveObjectInspectorFactory.javaTimestampObjectInspector;}
  public ObjectInspector genOI_BIGINT() { return PrimitiveObjectInspectorFactory.javaLongObjectInspector;}
  public ObjectInspector genOI_STRING() { return PrimitiveObjectInspectorFactory.javaStringObjectInspector;}
  
  public ObjectInspector genOI_VARCHAR(int k) {
    return PrimitiveObjectInspectorFactory
        .getPrimitiveJavaObjectInspector(TypeInfoFactory.getVarcharTypeInfo(k));
  }

  public Date gen_DATE() {
    return null;
  }

  public Date gen_DATE(Date earliest, Date latest) {
    return null;
  }
  
  public Timestamp gen_TIMESTAMP() {
    return null;
  }
  
  public Timestamp gen_TIMESTAMP(Timestamp earliest, Timestamp latest) {
    return null;
  }

  public Long gen_BIGINT() {
    return null;
  }
  
  public Long gen_BIGINT(long min, long max) {
    return null;
  }

  public HiveVarchar gen_VARCHAR(int k) {
    return null;
  }

  public String gen_STRING() {
    return null;
  }

  public String gen_STRING(int k) {
    return null;
  }
}
