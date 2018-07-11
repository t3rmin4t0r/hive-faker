package org.notmysock.hive.udf.faker.generated;

import java.util.ArrayList;
import java.util.Arrays;

import org.apache.hadoop.hive.ql.exec.Description;
import org.apache.hadoop.hive.ql.metadata.HiveException;
import org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector;
import org.notmysock.hive.udf.faker.AbstractGenericRowFakerBase;

@Description(name = "generate_ZEC1_ZPRC_ITEMS_TEST", value = "_FUNC_(seed [,rows])"
    + "- generate n-rows")
public class GenerateSeries_ZEC1_ZPRC_ITEMS_TEST extends
    AbstractGenericRowFakerBase {

  static final int JCS = 1075;
  static final String[] states = new String[] { "AP",
    "AS",
    "BR",
    "DD",
    "GJ",
    "HP",
    "HR",
    "JK",
    "KA",
    "KL",
    "KO",
    "MH",
    "MP",
    "MU",
    "NE",
    "OD",
    "PB",
    "RJ",
    "TN",
    "UPE",
    "UPW",
    "WB",};
  static final int[] populations = new int[] { 7, // AP
      3, // AS
      10, // BR
      2, // DD
      5, // GJ
      1, // HP
      2, // HR
      1, // JK
      5, // KA
      3, // KL
      1, // KO
      7, // MH
      8, // MP
      2, // MU
      1, // NE
      3, // OD
      2, // PB
      5, // RJ
      6, // TN
      10, // UPE
      7, // UPW
      8, // WB
  };

  protected ArrayList<String> getFieldNames() {
    ArrayList<String> fieldNames = new ArrayList<String>();
    fieldNames.add("ACCOUNT_ID");
    fieldNames.add("ACQUISITION_TYPE");
    fieldNames.add("ACTIVATION_DATE");
    fieldNames.add("ACTIVATION_FLG");
    fieldNames.add("ACTIVATION_TIME");
    fieldNames.add("AGEONNET");
    fieldNames.add("AUTH_PERSON_NAME");
    fieldNames.add("AUTHORIZED_SIGN_ID");
    fieldNames.add("BILLING_CYCLE");
    fieldNames.add("BILLING_MEDIA");
    fieldNames.add("BILLING_TYPE_CODE");
    fieldNames.add("BILLING_TYPE_TEXT");
    fieldNames.add("CAF_APP_DATE");
    fieldNames.add("CAF_APP_TAT");
    fieldNames.add("CAF_APP_TAT_SEC");
    fieldNames.add("CAF_APP_TIME");
    fieldNames.add("CAF_NUMBER");
    fieldNames.add("CAF_PEND_DATE");
    fieldNames.add("CAF_PEND_DATETIME");
    fieldNames.add("CAF_PEND_TAT");
    fieldNames.add("CAF_PEND_TIME");
    fieldNames.add("CAF_REJ_DATE");
    fieldNames.add("CAF_REJ_TAT");
    fieldNames.add("CAF_REJ_TIME");
    fieldNames.add("CAF_STATUS");
    fieldNames.add("CANC_DATE");
    fieldNames.add("CANC_TIME");
    fieldNames.add("CATEGORY_LEVEL");
    fieldNames.add("CIRCLE_NAME");
    fieldNames.add("CITY_MER");
    fieldNames.add("COMP_DATE");
    fieldNames.add("COMP_TAT");
    fieldNames.add("COMP_TAT_SEC");
    fieldNames.add("COMP_TIME");
    fieldNames.add("CONSUMER_TYPE");
    fieldNames.add("CONSUMER_TYPE_DESC");
    fieldNames.add("CONTRACT_ID");
    fieldNames.add("COUNTRY_MER");
    fieldNames.add("CREATED_ON");
    fieldNames.add("CREATED_ON_DATETIME");
    fieldNames.add("CREATED_ON_TIME");
    fieldNames.add("CREATION_DATE");
    fieldNames.add("CREATION_TIME");
    fieldNames.add("CUST_AREA");
    fieldNames.add("CUST_BUILDING");
    fieldNames.add("CUST_CITY");
    fieldNames.add("CUST_COUNTRY");
    fieldNames.add("CUST_JC");
    fieldNames.add("CUST_JC_DESC");
    fieldNames.add("CUST_JOB");
    fieldNames.add("CUST_JOB_TXT");
    fieldNames.add("CUST_POST_CODE");
    fieldNames.add("CUST_REGION");
    fieldNames.add("CUST_SEGMENT_CODE");
    fieldNames.add("CUST_SEGMENT_TEXT");
    fieldNames.add("CUST_STATE_DESC");
    fieldNames.add("CUSTOMER_AGE");
    fieldNames.add("DATE_OF_BIRTH");
    fieldNames.add("DEVICE_MAKE");
    fieldNames.add("DEVICE_MODEL");
    fieldNames.add("DIS_CHANNEL");
    fieldNames.add("DIST_CHNL_TXT");
    fieldNames.add("DIVISION");
    fieldNames.add("DRAFT_DIST_CHNL");
    fieldNames.add("DRAFT_DIST_CHNL_TEXT");
    fieldNames.add("DRAFT_ORDER");
    fieldNames.add("EKYC_FLAG");
    fieldNames.add("ENT_TYPE");
    fieldNames.add("FIRST_NAME");
    fieldNames.add("FTTX_CITY_CODE");
    fieldNames.add("FTTX_CITY_NAME");
    fieldNames.add("FTTX_JC_CODE");
    fieldNames.add("FTTX_JC_RJID");
    fieldNames.add("FTTX_STATE_NAME");
    fieldNames.add("FTTX_SUBCITY_NAME");
    fieldNames.add("GENDER");
    fieldNames.add("GUID_ITEM_ZPRC");
    fieldNames.add("GUID_ITEM_ZPRO");
    fieldNames.add("HEADER_ZPRC");
    fieldNames.add("HEADER_ZPRO");
    fieldNames.add("HEADQUARTER_ID");
    fieldNames.add("HEADQUARTER_TYPE");
    fieldNames.add("IMSI");
    fieldNames.add("JIO_PRIME_DATE");
    fieldNames.add("JIO_PRIME_FLAG");
    fieldNames.add("JIO_PRIME_TIMESTAMP");
    fieldNames.add("JIOCENTER_SAP_ID");
    fieldNames.add("LAST_NAME");
    fieldNames.add("LATEST_ZPRC_GUID");
    fieldNames.add("LOCATION_ID");
    fieldNames.add("LOCATION_NAME");
    fieldNames.add("LOCATION_TYPE");
    fieldNames.add("MACID");
    fieldNames.add("MANDT");
    fieldNames.add("MASTER_AGREEMENT_ID");
    fieldNames.add("MER_JC_STATE_NAME");
    fieldNames.add("MER_STATE_NAME");
    fieldNames.add("MERCHANT_BUILDING");
    fieldNames.add("MERCHANT_CIRCLE_ID");
    fieldNames.add("MERCHANT_CIRCLE_NAME");
    fieldNames.add("MERCHANT_CODE");
    fieldNames.add("MERCHANT_JC");
    fieldNames.add("MERCHANT_JC_CITY");
    fieldNames.add("MERCHANT_JC_PINCODE");
    fieldNames.add("MERCHANT_JC_STATE");
    fieldNames.add("MERCHANT_JC_TEXT");
    fieldNames.add("MERCHANT_NAME");
    fieldNames.add("MIDDLE_NAME");
    fieldNames.add("MNP_DONOR_CODE");
    fieldNames.add("MNP_DONOR_TEXT");
    fieldNames.add("MNP_FLAG");
    fieldNames.add("MOBILE_NO");
    fieldNames.add("MSG_STATE_PCEA");
    fieldNames.add("MSG_TYPE");
    fieldNames.add("MSISDN");
    fieldNames.add("OFFER_CODE");
    fieldNames.add("OFFER_DESC");
    fieldNames.add("ORDER_ORIGINATED_FLAG");
    fieldNames.add("ORDERED_PROD");
    fieldNames.add("ORDERID");
    fieldNames.add("ORG_NAME");
    fieldNames.add("OWNERSHIP");
    fieldNames.add("PARENT_ZPRC");
    fieldNames.add("PARENT_ZPRO");
    fieldNames.add("PARTNER");
    fieldNames.add("POS_AGENT_CODE");
    fieldNames.add("POS_AGENT_NAME");
    fieldNames.add("POST_CODE_MER");
    fieldNames.add("PROD_DESC");
    fieldNames.add("PROV_DATE");
    fieldNames.add("PROV_TAT");
    fieldNames.add("PROV_TAT_SEC");
    fieldNames.add("PROV_TIME");
    fieldNames.add("R4G_REGION");
    fieldNames.add("R4G_STATE");
    fieldNames.add("R4G_STATE_NAME");
    fieldNames.add("R4GID");
    fieldNames.add("REGION_MER");
    fieldNames.add("RH_ACTIVATION_DATE");
    fieldNames.add("RH_ACTIVATION_DATETIME");
    fieldNames.add("RH_ACTIVATION_MONTH");
    fieldNames.add("RH_ACTIVATION_TIME");
    fieldNames.add("RH_ACTIVE_PROD_FLG");
    fieldNames.add("RH_ACTUAL_PROD");
    fieldNames.add("UNPSECIFIED_COL_1");
    fieldNames.add("RH_DIB_CREATION_DATE");
    fieldNames.add("RH_SEGMENT");
    fieldNames.add("RH_STATUS");
    fieldNames.add("RH_STATUS_NEW");
    fieldNames.add("RH_TERMINATION_DATE");
    fieldNames.add("RH_TERMINATION_DATETIME");
    fieldNames.add("RH_TERMINATION_MONTH");
    fieldNames.add("RH_TERMINATION_TIME");
    fieldNames.add("SALES_ORG");
    fieldNames.add("SERV_DESC");
    fieldNames.add("SERV_TYPE");
    fieldNames.add("UNPSECIFIED_COL_2");
    fieldNames.add("SHARED_CONTRACT");
    fieldNames.add("SID");
    fieldNames.add("SUSPENDED_TIMESTAMP");
    fieldNames.add("TERMINATION_FLG");
    fieldNames.add("TIB_FAIL_FLG");
    fieldNames.add("TIBCO_ACT_NAME");
    fieldNames.add("TIBCO_ACT_STAT");
    fieldNames.add("TIBCO_FAIL_DATE");
    fieldNames.add("TIME_TAKEN_TV");
    fieldNames.add("TIME_TAKEN_TV_SEC");
    fieldNames.add("TITLE");
    fieldNames.add("TV_PEND_DATE");
    fieldNames.add("TV_PEND_DATETIME");
    fieldNames.add("TV_PEND_TAT");
    fieldNames.add("TV_PEND_TIME");
    fieldNames.add("TV_REJ_DATE");
    fieldNames.add("TV_REJ_TAT");
    fieldNames.add("TV_REJ_TIME");
    fieldNames.add("TV_STATUS");
    fieldNames.add("TV_SUC_DATE");
    fieldNames.add("TV_SUC_TAT");
    fieldNames.add("TV_SUC_TAT_SEC");
    fieldNames.add("TV_SUC_TIME");
    fieldNames.add("TV_TYPE");
    fieldNames.add("UNBARRING_TAT");
    fieldNames.add("UNBARRING_TAT_SEC");
    fieldNames.add("VIP_LEVEL");
    fieldNames.add("WIFI_ID");
    fieldNames.add("YH_HANAUPDTIMESTAMP");
    fieldNames.add("YH_HANAUPDTIMESTAMP_1");
    fieldNames.add("YYBULK_REF_NUM");
    fieldNames.add("YYCIRCLE_ID");
    fieldNames.add("YYEXT_REF_NUM");
    fieldNames.add("YYMNP_RELEVANCE");
    fieldNames.add("YYPLANOFFER");
    fieldNames.add("YYSIMNO");
    fieldNames.add("YYSTARTERKIT");
    fieldNames.add("YYVANITY_CODE");
    fieldNames.add("ZPRC_ITEM_STATUS");
    fieldNames.add("ZPRC_ITEM_STATUS_DESC");
    fieldNames.add("ZPRO_HDR_DATE");
    fieldNames.add("ZPRO_HDR_DATETIME");
    fieldNames.add("ZPRO_HDR_STATUS");
    fieldNames.add("ZPRO_HDR_STATUS_DESC");
    fieldNames.add("ZPRO_HDR_TIME");
    fieldNames.add("ZPRO_ITEM_DATE");
    fieldNames.add("ZPRO_ITEM_DATETIME");
    fieldNames.add("ZPRO_ITEM_STATUS");
    fieldNames.add("ZPRO_ITEM_STATUS_DESC");
    fieldNames.add("ZPRO_ITEM_TIME");
    fieldNames.add("SUSPENDED_REASON");
    fieldNames.add("SUSPENDED_REASON_DESC");
    fieldNames.add("RH_LOAD_TIME");
    return fieldNames;
  }

  protected ArrayList<ObjectInspector> getFieldInspectors() {
    ArrayList<ObjectInspector> fieldOIs = new ArrayList<ObjectInspector>();
    fieldOIs.add(genOI_VARCHAR(20));
    fieldOIs.add(genOI_VARCHAR(20));
    fieldOIs.add(genOI_DATE());
    fieldOIs.add(genOI_VARCHAR(5));
    fieldOIs.add(genOI_TIMESTAMP());
    fieldOIs.add(genOI_BIGINT());
    fieldOIs.add(genOI_VARCHAR(100));
    fieldOIs.add(genOI_VARCHAR(30));
    fieldOIs.add(genOI_VARCHAR(10));
    fieldOIs.add(genOI_VARCHAR(5));
    fieldOIs.add(genOI_VARCHAR(2));
    fieldOIs.add(genOI_VARCHAR(20));
    fieldOIs.add(genOI_DATE());
    fieldOIs.add(genOI_BIGINT());
    fieldOIs.add(genOI_BIGINT());
    fieldOIs.add(genOI_TIMESTAMP());
    fieldOIs.add(genOI_VARCHAR(60));
    fieldOIs.add(genOI_DATE());
    fieldOIs.add(genOI_TIMESTAMP());
    fieldOIs.add(genOI_BIGINT());
    fieldOIs.add(genOI_TIMESTAMP());
    fieldOIs.add(genOI_DATE());
    fieldOIs.add(genOI_BIGINT());
    fieldOIs.add(genOI_TIMESTAMP());
    fieldOIs.add(genOI_VARCHAR(50));
    fieldOIs.add(genOI_DATE());
    fieldOIs.add(genOI_TIMESTAMP());
    fieldOIs.add(genOI_VARCHAR(50));
    fieldOIs.add(genOI_VARCHAR(100));
    fieldOIs.add(genOI_VARCHAR(80));
    fieldOIs.add(genOI_DATE());
    fieldOIs.add(genOI_BIGINT());
    fieldOIs.add(genOI_BIGINT());
    fieldOIs.add(genOI_TIMESTAMP());
    fieldOIs.add(genOI_VARCHAR(4));
    fieldOIs.add(genOI_VARCHAR(40));
    fieldOIs.add(genOI_VARCHAR(20));
    fieldOIs.add(genOI_VARCHAR(60));
    fieldOIs.add(genOI_VARCHAR(8));
    fieldOIs.add(genOI_TIMESTAMP());
    fieldOIs.add(genOI_TIMESTAMP());
    fieldOIs.add(genOI_DATE());
    fieldOIs.add(genOI_TIMESTAMP());
    fieldOIs.add(genOI_VARCHAR(40));
    fieldOIs.add(genOI_VARCHAR(30));
    fieldOIs.add(genOI_VARCHAR(60));
    fieldOIs.add(genOI_VARCHAR(40));
    fieldOIs.add(genOI_VARCHAR(40));
    fieldOIs.add(genOI_VARCHAR(30));
    fieldOIs.add(genOI_VARCHAR(10));
    fieldOIs.add(genOI_VARCHAR(70));
    fieldOIs.add(genOI_VARCHAR(20));
    fieldOIs.add(genOI_VARCHAR(40));
    fieldOIs.add(genOI_VARCHAR(2));
    fieldOIs.add(genOI_VARCHAR(20));
    fieldOIs.add(genOI_VARCHAR(20));
    fieldOIs.add(genOI_BIGINT());
    fieldOIs.add(genOI_VARCHAR(8));
    fieldOIs.add(genOI_VARCHAR(40));
    fieldOIs.add(genOI_VARCHAR(30));
    fieldOIs.add(genOI_VARCHAR(10));
    fieldOIs.add(genOI_VARCHAR(100));
    fieldOIs.add(genOI_VARCHAR(10));
    fieldOIs.add(genOI_VARCHAR(20));
    fieldOIs.add(genOI_VARCHAR(200));
    fieldOIs.add(genOI_VARCHAR(10));
    fieldOIs.add(genOI_VARCHAR(15));
    fieldOIs.add(genOI_VARCHAR(90));
    fieldOIs.add(genOI_VARCHAR(50));
    fieldOIs.add(genOI_VARCHAR(20));
    fieldOIs.add(genOI_VARCHAR(60));
    fieldOIs.add(genOI_VARCHAR(20));
    fieldOIs.add(genOI_VARCHAR(60));
    fieldOIs.add(genOI_VARCHAR(60));
    fieldOIs.add(genOI_VARCHAR(60));
    fieldOIs.add(genOI_VARCHAR(8));
    fieldOIs.add(genOI_VARCHAR(32));
    fieldOIs.add(genOI_VARCHAR(32));
    fieldOIs.add(genOI_VARCHAR(32));
    fieldOIs.add(genOI_VARCHAR(32));
    fieldOIs.add(genOI_VARCHAR(30));
    fieldOIs.add(genOI_VARCHAR(10));
    fieldOIs.add(genOI_VARCHAR(60));
    fieldOIs.add(genOI_DATE());
    fieldOIs.add(genOI_VARCHAR(2));
    fieldOIs.add(genOI_TIMESTAMP());
    fieldOIs.add(genOI_VARCHAR(50));
    fieldOIs.add(genOI_VARCHAR(50));
    fieldOIs.add(genOI_VARCHAR(32));
    fieldOIs.add(genOI_VARCHAR(30));
    fieldOIs.add(genOI_VARCHAR(50));
    fieldOIs.add(genOI_VARCHAR(10));
    fieldOIs.add(genOI_VARCHAR(60));
    fieldOIs.add(genOI_VARCHAR(4));
    fieldOIs.add(genOI_VARCHAR(30));
    fieldOIs.add(genOI_VARCHAR(100));
    fieldOIs.add(genOI_VARCHAR(100));
    fieldOIs.add(genOI_VARCHAR(30));
    fieldOIs.add(genOI_VARCHAR(10));
    fieldOIs.add(genOI_VARCHAR(100));
    fieldOIs.add(genOI_VARCHAR(20));
    fieldOIs.add(genOI_VARCHAR(20));
    fieldOIs.add(genOI_VARCHAR(80));
    fieldOIs.add(genOI_VARCHAR(10));
    fieldOIs.add(genOI_VARCHAR(100));
    fieldOIs.add(genOI_VARCHAR(100));
    fieldOIs.add(genOI_VARCHAR(100));
    fieldOIs.add(genOI_VARCHAR(50));
    fieldOIs.add(genOI_VARCHAR(3));
    fieldOIs.add(genOI_VARCHAR(45));
    fieldOIs.add(genOI_VARCHAR(2));
    fieldOIs.add(genOI_VARCHAR(50));
    fieldOIs.add(genOI_VARCHAR(5));
    fieldOIs.add(genOI_VARCHAR(10));
    fieldOIs.add(genOI_VARCHAR(60));
    fieldOIs.add(genOI_VARCHAR(50));
    fieldOIs.add(genOI_VARCHAR(100));
    fieldOIs.add(genOI_VARCHAR(30));
    fieldOIs.add(genOI_VARCHAR(20));
    fieldOIs.add(genOI_VARCHAR(10));
    fieldOIs.add(genOI_VARCHAR(100));
    fieldOIs.add(genOI_VARCHAR(20));
    fieldOIs.add(genOI_VARCHAR(32));
    fieldOIs.add(genOI_VARCHAR(32));
    fieldOIs.add(genOI_VARCHAR(10));
    fieldOIs.add(genOI_VARCHAR(10));
    fieldOIs.add(genOI_VARCHAR(100));
    fieldOIs.add(genOI_VARCHAR(20));
    fieldOIs.add(genOI_VARCHAR(100));
    fieldOIs.add(genOI_DATE());
    fieldOIs.add(genOI_BIGINT());
    fieldOIs.add(genOI_BIGINT());
    fieldOIs.add(genOI_TIMESTAMP());
    fieldOIs.add(genOI_VARCHAR(20));
    fieldOIs.add(genOI_VARCHAR(2));
    fieldOIs.add(genOI_VARCHAR(100));
    fieldOIs.add(genOI_VARCHAR(60));
    fieldOIs.add(genOI_VARCHAR(60));
    fieldOIs.add(genOI_DATE());
    fieldOIs.add(genOI_TIMESTAMP());
    fieldOIs.add(genOI_VARCHAR(6));
    fieldOIs.add(genOI_TIMESTAMP());
    fieldOIs.add(genOI_VARCHAR(10));
    fieldOIs.add(genOI_VARCHAR(10));
    fieldOIs.add(genOI_VARCHAR(200));
    fieldOIs.add(genOI_DATE());
    fieldOIs.add(genOI_VARCHAR(20));
    fieldOIs.add(genOI_VARCHAR(20));
    fieldOIs.add(genOI_VARCHAR(20));
    fieldOIs.add(genOI_DATE());
    fieldOIs.add(genOI_TIMESTAMP());
    fieldOIs.add(genOI_VARCHAR(6));
    fieldOIs.add(genOI_TIMESTAMP());
    fieldOIs.add(genOI_VARCHAR(10));
    fieldOIs.add(genOI_VARCHAR(20));
    fieldOIs.add(genOI_VARCHAR(10));
    fieldOIs.add(genOI_VARCHAR(50));
    fieldOIs.add(genOI_VARCHAR(20));
    fieldOIs.add(genOI_VARCHAR(3));
    fieldOIs.add(genOI_TIMESTAMP());
    fieldOIs.add(genOI_VARCHAR(5));
    fieldOIs.add(genOI_VARCHAR(2));
    fieldOIs.add(genOI_VARCHAR(100));
    fieldOIs.add(genOI_VARCHAR(50));
    fieldOIs.add(genOI_DATE());
    fieldOIs.add(genOI_BIGINT());
    fieldOIs.add(genOI_BIGINT());
    fieldOIs.add(genOI_VARCHAR(50));
    fieldOIs.add(genOI_DATE());
    fieldOIs.add(genOI_TIMESTAMP());
    fieldOIs.add(genOI_BIGINT());
    fieldOIs.add(genOI_TIMESTAMP());
    fieldOIs.add(genOI_DATE());
    fieldOIs.add(genOI_BIGINT());
    fieldOIs.add(genOI_TIMESTAMP());
    fieldOIs.add(genOI_VARCHAR(50));
    fieldOIs.add(genOI_DATE());
    fieldOIs.add(genOI_BIGINT());
    fieldOIs.add(genOI_BIGINT());
    fieldOIs.add(genOI_TIMESTAMP());
    fieldOIs.add(genOI_VARCHAR(50));
    fieldOIs.add(genOI_BIGINT());
    fieldOIs.add(genOI_BIGINT());
    fieldOIs.add(genOI_VARCHAR(50));
    fieldOIs.add(genOI_VARCHAR(50));
    fieldOIs.add(genOI_TIMESTAMP());
    fieldOIs.add(genOI_TIMESTAMP());
    fieldOIs.add(genOI_VARCHAR(40));
    fieldOIs.add(genOI_VARCHAR(20));
    fieldOIs.add(genOI_VARCHAR(50));
    fieldOIs.add(genOI_VARCHAR(10));
    fieldOIs.add(genOI_VARCHAR(10));
    fieldOIs.add(genOI_VARCHAR(50));
    fieldOIs.add(genOI_VARCHAR(20));
    fieldOIs.add(genOI_VARCHAR(30));
    fieldOIs.add(genOI_VARCHAR(10));
    fieldOIs.add(genOI_VARCHAR(200));
    fieldOIs.add(genOI_DATE());
    fieldOIs.add(genOI_TIMESTAMP());
    fieldOIs.add(genOI_VARCHAR(20));
    fieldOIs.add(genOI_VARCHAR(200));
    fieldOIs.add(genOI_TIMESTAMP());
    fieldOIs.add(genOI_DATE());
    fieldOIs.add(genOI_TIMESTAMP());
    fieldOIs.add(genOI_VARCHAR(10));
    fieldOIs.add(genOI_VARCHAR(200));
    fieldOIs.add(genOI_TIMESTAMP());
    fieldOIs.add(genOI_STRING());
    fieldOIs.add(genOI_STRING());
    fieldOIs.add(genOI_TIMESTAMP());
    return fieldOIs;
  }

  protected Object getRow() throws HiveException {
    final Object ACCOUNT_ID = gen_VARCHAR(20, ""+Math.abs(gen_BIGINT()));
    final Object ACQUISITION_TYPE = gen_VARCHAR(20, gen_CHOICE("", "PRIME", 90));
    final Object ACTIVATION_DATE = gen_DATE();
    final Object ACTIVATION_FLG = gen_VARCHAR(5);
    final Object ACTIVATION_TIME = gen_TIMESTAMP();
    final Object AGEONNET = gen_BIGINT();
    final Object AUTH_PERSON_NAME = gen_VARCHAR(100);
    final Object AUTHORIZED_SIGN_ID = gen_VARCHAR(30);
    final Object BILLING_CYCLE = gen_VARCHAR(10);
    final Object BILLING_MEDIA = gen_VARCHAR(5);
    final Object BILLING_TYPE_CODE = gen_VARCHAR(2);
    final Object BILLING_TYPE_TEXT = gen_VARCHAR(20);
    final Object CAF_APP_DATE = gen_DATE();
    final Object CAF_APP_TAT = gen_BIGINT();
    final Object CAF_APP_TAT_SEC = gen_BIGINT();
    final Object CAF_APP_TIME = gen_TIMESTAMP();
    final Object CAF_NUMBER = gen_VARCHAR(60);
    final Object CAF_PEND_DATE = gen_DATE();
    final Object CAF_PEND_DATETIME = gen_TIMESTAMP();
    final Object CAF_PEND_TAT = gen_BIGINT();
    final Object CAF_PEND_TIME = gen_TIMESTAMP();
    final Object CAF_REJ_DATE = gen_DATE();
    final Object CAF_REJ_TAT = gen_BIGINT();
    final Object CAF_REJ_TIME = gen_TIMESTAMP();
    final Object CAF_STATUS = gen_VARCHAR(50);
    final Object CANC_DATE = gen_DATE();
    final Object CANC_TIME = gen_TIMESTAMP();
    final Object CATEGORY_LEVEL = gen_VARCHAR(50);
    final Object CIRCLE_NAME = gen_VARCHAR(100);
    final Object CITY_MER = gen_VARCHAR(80);
    final Object COMP_DATE = gen_DATE();
    final Object COMP_TAT = gen_BIGINT();
    final Object COMP_TAT_SEC = gen_BIGINT();
    final Object COMP_TIME = gen_TIMESTAMP();
    final Object CONSUMER_TYPE = gen_VARCHAR(4);
    final Object CONSUMER_TYPE_DESC = gen_VARCHAR(40);
    final Object CONTRACT_ID = gen_VARCHAR(20);
    final Object COUNTRY_MER = gen_VARCHAR(60);
    final Object CREATED_ON = gen_VARCHAR(8);
    final Object CREATED_ON_DATETIME = gen_TIMESTAMP();
    final Object CREATED_ON_TIME = gen_TIMESTAMP();
    final Object CREATION_DATE = gen_DATE();
    final Object CREATION_TIME = gen_TIMESTAMP();
    final Object CUST_AREA = gen_VARCHAR(40);
    final Object CUST_BUILDING = gen_VARCHAR(30);
    final Object CUST_CITY = gen_VARCHAR(60);
    final Object CUST_COUNTRY = gen_VARCHAR(40);
    final Object CUST_JC = gen_VARCHAR(40);
    final Object CUST_JC_DESC = gen_VARCHAR(30);
    final Object CUST_JOB = gen_VARCHAR(10);
    final Object CUST_JOB_TXT = gen_VARCHAR(70);
    final Object CUST_POST_CODE = gen_VARCHAR(20);
    final Object CUST_REGION = gen_VARCHAR(40);
    final Object CUST_SEGMENT_CODE = gen_VARCHAR(2);
    final Object CUST_SEGMENT_TEXT = gen_VARCHAR(20);
    final Object CUST_STATE_DESC = gen_VARCHAR(20);
    final Object CUSTOMER_AGE = gen_BIGINT();
    final Object DATE_OF_BIRTH = gen_VARCHAR(8, gen_DATE().toString());
    final Object DEVICE_MAKE = gen_VARCHAR(40);
    final Object DEVICE_MODEL = gen_VARCHAR(30);
    final Object DIS_CHANNEL = gen_VARCHAR(10);
    final Object DIST_CHNL_TXT = gen_VARCHAR(100);
    final Object DIVISION = gen_VARCHAR(10);
    final Object DRAFT_DIST_CHNL = gen_VARCHAR(20);
    final Object DRAFT_DIST_CHNL_TEXT = gen_VARCHAR(200);
    final Object DRAFT_ORDER = gen_VARCHAR(10);
    final Object RH_ACTIVATION_DATE = gen_DATE(java.sql.Date.valueOf((ACTIVATION_DATE.toString())), getLast());
    // EKYC is only failed for a small number of recent users
    final Object EKYC_FLAG = gen_VARCHAR(15, ("2018-12-01".compareTo(RH_ACTIVATION_DATE.toString()) < 0) ? gen_CHOICE("eKYC", "NON-eKYC", 80) : "eKYC");
    final Object ENT_TYPE = gen_VARCHAR(90);
    final Object FIRST_NAME = gen_VARCHAR(50);
    final Object FTTX_CITY_CODE = gen_VARCHAR(20);
    final Object FTTX_CITY_NAME = gen_VARCHAR(60);
    final Object FTTX_JC_CODE = gen_VARCHAR(20);
    final Object FTTX_JC_RJID = gen_VARCHAR(60);
    final Object FTTX_STATE_NAME = gen_VARCHAR(60);
    final Object FTTX_SUBCITY_NAME = gen_VARCHAR(60);
    final Object GENDER = gen_VARCHAR(8, gen_CHOICE("M", "F", 50));
    final String state =  gen_CHOICE(states, populations);
    final int state_id = Arrays.binarySearch(states, state);
    final Object R4G_REGION = gen_VARCHAR(20);
    final Object R4G_STATE = gen_VARCHAR(2, state);
    final Object R4G_STATE_NAME = gen_VARCHAR(100);
    final Object R4GID = gen_VARCHAR(60);
    final Object REGION_MER = gen_VARCHAR(60);
    final Object GUID_ITEM_ZPRC = gen_VARCHAR(32, gen_UUID());
    final Object GUID_ITEM_ZPRO = gen_VARCHAR(32, gen_UUID());
    final Object HEADER_ZPRC = gen_VARCHAR(32);
    final Object HEADER_ZPRO = gen_VARCHAR(32);
    final Object HEADQUARTER_ID = gen_VARCHAR(30);
    final Object HEADQUARTER_TYPE = gen_VARCHAR(10);
    final Object IMSI = gen_VARCHAR(60, ""+Math.abs(gen_BIGINT()));
    final Object JIO_PRIME_DATE = gen_DATE();
    final Object JIO_PRIME_FLAG = gen_CHOICE("Y", "N", 50);
    final Object JIO_PRIME_TIMESTAMP = gen_TIMESTAMP();
    final Object JIOCENTER_SAP_ID = gen_VARCHAR(50);
    final Object LAST_NAME = gen_VARCHAR(50);
    final Object LATEST_ZPRC_GUID = gen_VARCHAR(32, gen_UUID());
    final Object LOCATION_ID = gen_VARCHAR(30);
    final Object LOCATION_NAME = gen_VARCHAR(50);
    final Object LOCATION_TYPE = gen_VARCHAR(10);
    final Object MACID = gen_VARCHAR(60);
    final Object MANDT = gen_VARCHAR(4);
    final Object MASTER_AGREEMENT_ID = gen_VARCHAR(30);
    final Object MER_JC_STATE_NAME = gen_VARCHAR(100);
    final Object MER_STATE_NAME = gen_VARCHAR(100);
    final Object MERCHANT_BUILDING = gen_VARCHAR(30);
    final Object MERCHANT_CIRCLE_ID = gen_VARCHAR(10);
    final Object MERCHANT_CIRCLE_NAME = gen_VARCHAR(100);
    final Object MERCHANT_CODE = gen_VARCHAR(20);
    final Object MERCHANT_JC = gen_VARCHAR(20, "" + (state_id * 50+getRandom().nextInt(50)));
    final Object MERCHANT_JC_CITY = gen_VARCHAR(80);
    final Object MERCHANT_JC_PINCODE = gen_VARCHAR(10, (state_id * 500) + "" + (getRandom().nextInt(500)));
    final Object MERCHANT_JC_STATE = gen_VARCHAR(100, state);
    final Object MERCHANT_JC_TEXT = gen_VARCHAR(100);
    final Object MERCHANT_NAME = gen_VARCHAR(100);
    final Object MIDDLE_NAME = gen_VARCHAR(50);
    final Object MNP_DONOR_CODE = gen_VARCHAR(3);
    final Object MNP_DONOR_TEXT = gen_VARCHAR(45);
    final Object MNP_FLAG = gen_VARCHAR(2);
    final Object MOBILE_NO = gen_VARCHAR(50, getFaker().phoneNumber().phoneNumber());
    final Object MSG_STATE_PCEA = gen_VARCHAR(5);
    final Object MSG_TYPE = gen_VARCHAR(10);
    final Object MSISDN = gen_VARCHAR(60);
    final Object OFFER_CODE = gen_VARCHAR(50);
    final Object OFFER_DESC = gen_VARCHAR(100);
    final Object ORDER_ORIGINATED_FLAG = gen_VARCHAR(30);
    final Object ORDERED_PROD = gen_VARCHAR(20);
    final Object ORDERID = gen_VARCHAR(10);
    final Object ORG_NAME = gen_VARCHAR(100);
    final Object OWNERSHIP = gen_VARCHAR(20);
    final Object PARENT_ZPRC = gen_VARCHAR(32);
    final Object PARENT_ZPRO = gen_VARCHAR(32);
    final Object PARTNER = gen_VARCHAR(10);
    final Object POS_AGENT_CODE = gen_VARCHAR(10);
    final Object POS_AGENT_NAME = gen_VARCHAR(100);
    final Object POST_CODE_MER = gen_VARCHAR(20);
    final Object PROD_DESC = gen_VARCHAR(100);
    final Object PROV_DATE = gen_DATE();
    final Object PROV_TAT = gen_BIGINT();
    final Object PROV_TAT_SEC = gen_BIGINT();
    final Object PROV_TIME = gen_TIMESTAMP();
    final Object RH_ACTIVATION_DATETIME = gen_TIMESTAMP();
    final Object RH_ACTIVATION_MONTH = gen_VARCHAR(6);
    final Object RH_ACTIVATION_TIME = gen_TIMESTAMP();
    final Object RH_ACTIVE_PROD_FLG = gen_VARCHAR(10);
    final Object RH_ACTUAL_PROD = gen_VARCHAR(10);
    final Object UNPSECIFIED_COL_1 = gen_VARCHAR(200);
    final Object RH_DIB_CREATION_DATE = gen_DATE();
    final Object RH_SEGMENT = gen_VARCHAR(20);
    final Object RH_STATUS = gen_VARCHAR(20);
    final Object RH_STATUS_NEW = gen_VARCHAR(20);
    final Object RH_TERMINATION_DATE = gen_DATE();
    final Object RH_TERMINATION_DATETIME = gen_TIMESTAMP();
    final Object RH_TERMINATION_MONTH = gen_VARCHAR(6);
    final Object RH_TERMINATION_TIME = gen_TIMESTAMP();
    final Object SALES_ORG = gen_VARCHAR(10);
    final Object SERV_DESC = gen_VARCHAR(20);
    final Object SERV_TYPE = gen_VARCHAR(10);
    final Object UNPSECIFIED_COL_2 = gen_VARCHAR(50);
    final Object SHARED_CONTRACT = gen_VARCHAR(20);
    final Object SID = gen_VARCHAR(3);
    final Object SUSPENDED_TIMESTAMP = gen_TIMESTAMP();
    final Object TERMINATION_FLG = gen_VARCHAR(5);
    final Object TIB_FAIL_FLG = gen_VARCHAR(2);
    final Object TIBCO_ACT_NAME = gen_VARCHAR(100);
    final Object TIBCO_ACT_STAT = gen_VARCHAR(50);
    final Object TIBCO_FAIL_DATE = gen_DATE();
    final Object TIME_TAKEN_TV = gen_BIGINT();
    final Object TIME_TAKEN_TV_SEC = gen_BIGINT();
    final Object TITLE = gen_VARCHAR(50);
    final Object TV_PEND_DATE = gen_DATE();
    final Object TV_PEND_DATETIME = gen_TIMESTAMP();
    final Object TV_PEND_TAT = gen_BIGINT();
    final Object TV_PEND_TIME = gen_TIMESTAMP();
    final Object TV_REJ_DATE = gen_DATE();
    final Object TV_REJ_TAT = gen_BIGINT();
    final Object TV_REJ_TIME = gen_TIMESTAMP();
    final Object TV_STATUS = gen_VARCHAR(50);
    final Object TV_SUC_DATE = gen_DATE();
    final Object TV_SUC_TAT = gen_BIGINT();
    final Object TV_SUC_TAT_SEC = gen_BIGINT();
    final Object TV_SUC_TIME = gen_TIMESTAMP();
    final Object TV_TYPE = gen_VARCHAR(50);
    final Object UNBARRING_TAT = gen_BIGINT();
    final Object UNBARRING_TAT_SEC = gen_BIGINT();
    final Object VIP_LEVEL = gen_VARCHAR(50);
    final Object WIFI_ID = gen_VARCHAR(50);
    final Object YH_HANAUPDTIMESTAMP = gen_TIMESTAMP();
    final Object YH_HANAUPDTIMESTAMP_1 = gen_TIMESTAMP();
    final Object YYBULK_REF_NUM = gen_VARCHAR(40);
    final Object YYCIRCLE_ID = gen_VARCHAR(20);
    final Object YYEXT_REF_NUM = gen_VARCHAR(50);
    final Object YYMNP_RELEVANCE = gen_VARCHAR(10);
    final Object YYPLANOFFER = gen_VARCHAR(10);
    final Object YYSIMNO = gen_VARCHAR(50);
    final Object YYSTARTERKIT = gen_VARCHAR(20);
    final Object YYVANITY_CODE = gen_VARCHAR(30);
    final Object ZPRC_ITEM_STATUS = gen_VARCHAR(10);
    final Object ZPRC_ITEM_STATUS_DESC = gen_VARCHAR(200);
    final Object ZPRO_HDR_DATE = gen_DATE();
    final Object ZPRO_HDR_DATETIME = gen_TIMESTAMP();
    final Object ZPRO_HDR_STATUS = gen_VARCHAR(20);
    final Object ZPRO_HDR_STATUS_DESC = gen_VARCHAR(200);
    final Object ZPRO_HDR_TIME = gen_TIMESTAMP();
    final Object ZPRO_ITEM_DATE = gen_DATE();
    final Object ZPRO_ITEM_DATETIME = gen_TIMESTAMP();
    final Object ZPRO_ITEM_STATUS = gen_VARCHAR(10);
    final Object ZPRO_ITEM_STATUS_DESC = gen_VARCHAR(200);
    final Object ZPRO_ITEM_TIME = gen_TIMESTAMP();
    final Object SUSPENDED_REASON = gen_STRING();
    final Object SUSPENDED_REASON_DESC = gen_STRING();
    final Object RH_LOAD_TIME = gen_TIMESTAMP();
    ;
    return new Object[] { ACCOUNT_ID, ACQUISITION_TYPE, ACTIVATION_DATE,
        ACTIVATION_FLG, ACTIVATION_TIME, AGEONNET, AUTH_PERSON_NAME,
        AUTHORIZED_SIGN_ID, BILLING_CYCLE, BILLING_MEDIA, BILLING_TYPE_CODE,
        BILLING_TYPE_TEXT, CAF_APP_DATE, CAF_APP_TAT, CAF_APP_TAT_SEC,
        CAF_APP_TIME, CAF_NUMBER, CAF_PEND_DATE, CAF_PEND_DATETIME,
        CAF_PEND_TAT, CAF_PEND_TIME, CAF_REJ_DATE, CAF_REJ_TAT, CAF_REJ_TIME,
        CAF_STATUS, CANC_DATE, CANC_TIME, CATEGORY_LEVEL, CIRCLE_NAME,
        CITY_MER, COMP_DATE, COMP_TAT, COMP_TAT_SEC, COMP_TIME, CONSUMER_TYPE,
        CONSUMER_TYPE_DESC, CONTRACT_ID, COUNTRY_MER, CREATED_ON,
        CREATED_ON_DATETIME, CREATED_ON_TIME, CREATION_DATE, CREATION_TIME,
        CUST_AREA, CUST_BUILDING, CUST_CITY, CUST_COUNTRY, CUST_JC,
        CUST_JC_DESC, CUST_JOB, CUST_JOB_TXT, CUST_POST_CODE, CUST_REGION,
        CUST_SEGMENT_CODE, CUST_SEGMENT_TEXT, CUST_STATE_DESC, CUSTOMER_AGE,
        DATE_OF_BIRTH, DEVICE_MAKE, DEVICE_MODEL, DIS_CHANNEL, DIST_CHNL_TXT,
        DIVISION, DRAFT_DIST_CHNL, DRAFT_DIST_CHNL_TEXT, DRAFT_ORDER,
        EKYC_FLAG, ENT_TYPE, FIRST_NAME, FTTX_CITY_CODE, FTTX_CITY_NAME,
        FTTX_JC_CODE, FTTX_JC_RJID, FTTX_STATE_NAME, FTTX_SUBCITY_NAME, GENDER,
        GUID_ITEM_ZPRC, GUID_ITEM_ZPRO, HEADER_ZPRC, HEADER_ZPRO,
        HEADQUARTER_ID, HEADQUARTER_TYPE, IMSI, JIO_PRIME_DATE, JIO_PRIME_FLAG,
        JIO_PRIME_TIMESTAMP, JIOCENTER_SAP_ID, LAST_NAME, LATEST_ZPRC_GUID,
        LOCATION_ID, LOCATION_NAME, LOCATION_TYPE, MACID, MANDT,
        MASTER_AGREEMENT_ID, MER_JC_STATE_NAME, MER_STATE_NAME,
        MERCHANT_BUILDING, MERCHANT_CIRCLE_ID, MERCHANT_CIRCLE_NAME,
        MERCHANT_CODE, MERCHANT_JC, MERCHANT_JC_CITY, MERCHANT_JC_PINCODE,
        MERCHANT_JC_STATE, MERCHANT_JC_TEXT, MERCHANT_NAME, MIDDLE_NAME,
        MNP_DONOR_CODE, MNP_DONOR_TEXT, MNP_FLAG, MOBILE_NO, MSG_STATE_PCEA,
        MSG_TYPE, MSISDN, OFFER_CODE, OFFER_DESC, ORDER_ORIGINATED_FLAG,
        ORDERED_PROD, ORDERID, ORG_NAME, OWNERSHIP, PARENT_ZPRC, PARENT_ZPRO,
        PARTNER, POS_AGENT_CODE, POS_AGENT_NAME, POST_CODE_MER, PROD_DESC,
        PROV_DATE, PROV_TAT, PROV_TAT_SEC, PROV_TIME, R4G_REGION, R4G_STATE,
        R4G_STATE_NAME, R4GID, REGION_MER, RH_ACTIVATION_DATE,
        RH_ACTIVATION_DATETIME, RH_ACTIVATION_MONTH, RH_ACTIVATION_TIME,
        RH_ACTIVE_PROD_FLG, RH_ACTUAL_PROD, UNPSECIFIED_COL_1,
        RH_DIB_CREATION_DATE, RH_SEGMENT, RH_STATUS, RH_STATUS_NEW,
        RH_TERMINATION_DATE, RH_TERMINATION_DATETIME, RH_TERMINATION_MONTH,
        RH_TERMINATION_TIME, SALES_ORG, SERV_DESC, SERV_TYPE,
        UNPSECIFIED_COL_2, SHARED_CONTRACT, SID, SUSPENDED_TIMESTAMP,
        TERMINATION_FLG, TIB_FAIL_FLG, TIBCO_ACT_NAME, TIBCO_ACT_STAT,
        TIBCO_FAIL_DATE, TIME_TAKEN_TV, TIME_TAKEN_TV_SEC, TITLE, TV_PEND_DATE,
        TV_PEND_DATETIME, TV_PEND_TAT, TV_PEND_TIME, TV_REJ_DATE, TV_REJ_TAT,
        TV_REJ_TIME, TV_STATUS, TV_SUC_DATE, TV_SUC_TAT, TV_SUC_TAT_SEC,
        TV_SUC_TIME, TV_TYPE, UNBARRING_TAT, UNBARRING_TAT_SEC, VIP_LEVEL,
        WIFI_ID, YH_HANAUPDTIMESTAMP, YH_HANAUPDTIMESTAMP_1, YYBULK_REF_NUM,
        YYCIRCLE_ID, YYEXT_REF_NUM, YYMNP_RELEVANCE, YYPLANOFFER, YYSIMNO,
        YYSTARTERKIT, YYVANITY_CODE, ZPRC_ITEM_STATUS, ZPRC_ITEM_STATUS_DESC,
        ZPRO_HDR_DATE, ZPRO_HDR_DATETIME, ZPRO_HDR_STATUS,
        ZPRO_HDR_STATUS_DESC, ZPRO_HDR_TIME, ZPRO_ITEM_DATE,
        ZPRO_ITEM_DATETIME, ZPRO_ITEM_STATUS, ZPRO_ITEM_STATUS_DESC,
        ZPRO_ITEM_TIME, SUSPENDED_REASON, SUSPENDED_REASON_DESC, RH_LOAD_TIME };
  }
}
