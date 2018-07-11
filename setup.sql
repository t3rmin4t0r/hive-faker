use testing;


add jar /tmp/hive-faker-1.0-SNAPSHOT.jar ;
set hive.llap.execution.mode=none;

set mapred.reduce.tasks=1024;
create temporary function generate_series as 'org.notmysock.hive.udf.GenerateSeriesUDTF';
create temporary function generate_TABLE as 'org.notmysock.hive.udf.faker.generated.GenerateSeries_ZEC1_ZPRC_ITEMS_TEST';
create temporary table if not exists foo stored as orc as
with c as (select generate_series(200*1000)),
cc as (select seq_0 as i from c cluster by i)
select generate_TABLE(i, 1000) from cc
;



CREATE TABLE if not exists ZEC1_ZPRC_ITEMS_TEST  (
  ACCOUNT_ID VARCHAR(20),
  ACQUISITION_TYPE VARCHAR(20),
  ACTIVATION_DATE DATE,
  ACTIVATION_FLG VARCHAR(5),
  ACTIVATION_TIME TIMESTAMP,
  AGEONNET BIGINT,
  AUTH_PERSON_NAME VARCHAR(100),
  AUTHORIZED_SIGN_ID VARCHAR(30),
  BILLING_CYCLE VARCHAR(10),
  BILLING_MEDIA VARCHAR(5),
  BILLING_TYPE_CODE VARCHAR(2),
  BILLING_TYPE_TEXT VARCHAR(20),
  CAF_APP_DATE VARCHAR(8),
  CAF_APP_TAT BIGINT,
  CAF_APP_TAT_SEC BIGINT,
  CAF_APP_TIME VARCHAR(6),
  CAF_NUMBER VARCHAR(60),
  CAF_PEND_DATE VARCHAR(8),
  CAF_PEND_DATETIME VARCHAR(14),
  CAF_PEND_TAT BIGINT,
  CAF_PEND_TIME VARCHAR(6),
  CAF_REJ_DATE VARCHAR(8),
  CAF_REJ_TAT BIGINT,
  CAF_REJ_TIME VARCHAR(6),
  CAF_STATUS VARCHAR(50),
  CANC_DATE VARCHAR(8),
  CANC_TIME VARCHAR(6),
  CATEGORY_LEVEL VARCHAR(50),
  CIRCLE_NAME VARCHAR(100),
  CITY_MER VARCHAR(80),
  COMP_DATE VARCHAR(8),
  COMP_TAT BIGINT,
  COMP_TAT_SEC BIGINT,
  COMP_TIME VARCHAR(6),
  CONSUMER_TYPE VARCHAR(4),
  CONSUMER_TYPE_DESC VARCHAR(40),
  CONTRACT_ID VARCHAR(20),
  COUNTRY_MER VARCHAR(60),
  CREATED_ON VARCHAR(8),
  CREATED_ON_DATETIME VARCHAR(14),
  CREATED_ON_TIME VARCHAR(6),
  CREATION_DATE DATE,
  CREATION_TIME TIMESTAMP,
  CUST_AREA VARCHAR(40),
  CUST_BUILDING VARCHAR(30),
  CUST_CITY VARCHAR(60),
  CUST_COUNTRY VARCHAR(40),
  CUST_JC VARCHAR(40),
  CUST_JC_DESC VARCHAR(30),
  CUST_JOB VARCHAR(10),
  CUST_JOB_TXT VARCHAR(70),
  CUST_POST_CODE VARCHAR(20),
  CUST_REGION VARCHAR(40),
  CUST_SEGMENT_CODE VARCHAR(2),
  CUST_SEGMENT_TEXT VARCHAR(20),
  CUST_STATE_DESC VARCHAR(20),
  CUSTOMER_AGE BIGINT,
  DATE_OF_BIRTH VARCHAR(8),
  DEVICE_MAKE VARCHAR(40),
  DEVICE_MODEL VARCHAR(30),
  DIS_CHANNEL VARCHAR(10),
  DIST_CHNL_TXT VARCHAR(100),
  DIVISION VARCHAR(10),
  DRAFT_DIST_CHNL VARCHAR(20),
  DRAFT_DIST_CHNL_TEXT VARCHAR(200),
  DRAFT_ORDER VARCHAR(10),
  EKYC_FLAG VARCHAR(15),
  ENT_TYPE VARCHAR(90),
  FIRST_NAME VARCHAR(50),
  FTTX_CITY_CODE VARCHAR(20),
  FTTX_CITY_NAME VARCHAR(60),
  FTTX_JC_CODE VARCHAR(20),
  FTTX_JC_RJID VARCHAR(60),
  FTTX_STATE_NAME VARCHAR(60),
  FTTX_SUBCITY_NAME VARCHAR(60),
  GENDER VARCHAR(8),
  GUID_ITEM_ZPRC VARCHAR(32),
  GUID_ITEM_ZPRO VARCHAR(32),
  HEADER_ZPRC VARCHAR(32),
  HEADER_ZPRO VARCHAR(32),
  HEADQUARTER_ID VARCHAR(30),
  HEADQUARTER_TYPE VARCHAR(10),
  IMSI VARCHAR(60),
  JIO_PRIME_DATE DATE,
  JIO_PRIME_FLAG VARCHAR(2),
  JIO_PRIME_TIMESTAMP TIMESTAMP,
  JIOCENTER_SAP_ID VARCHAR(50),
  LAST_NAME VARCHAR(50),
  LATEST_ZPRC_GUID VARCHAR(32),
  LOCATION_ID VARCHAR(30),
  LOCATION_NAME VARCHAR(50),
  LOCATION_TYPE VARCHAR(10),
  MACID VARCHAR(60),
  MANDT VARCHAR(4),
  MASTER_AGREEMENT_ID VARCHAR(30),
  MER_JC_STATE_NAME VARCHAR(100),
  MER_STATE_NAME VARCHAR(100),
  MERCHANT_BUILDING VARCHAR(30),
  MERCHANT_CIRCLE_ID VARCHAR(10),
  MERCHANT_CIRCLE_NAME VARCHAR(100),
  MERCHANT_CODE VARCHAR(20),
  MERCHANT_JC VARCHAR(20),
  MERCHANT_JC_CITY VARCHAR(80),
  MERCHANT_JC_PINCODE VARCHAR(10),
  MERCHANT_JC_STATE VARCHAR(100),
  MERCHANT_JC_TEXT VARCHAR(100),
  MERCHANT_NAME VARCHAR(100),
  MIDDLE_NAME VARCHAR(50),
  MNP_DONOR_CODE VARCHAR(3),
  MNP_DONOR_TEXT VARCHAR(45),
  MNP_FLAG VARCHAR(2),
  MOBILE_NO VARCHAR(50),
  MSG_STATE_PCEA VARCHAR(5),
  MSG_TYPE VARCHAR(10),
  MSISDN VARCHAR(60),
  OFFER_CODE VARCHAR(50),
  OFFER_DESC VARCHAR(100),
  ORDER_ORIGINATED_FLAG VARCHAR(30),
  ORDERED_PROD VARCHAR(20),
  ORDERID VARCHAR(10),
  ORG_NAME VARCHAR(100),
  OWNERSHIP VARCHAR(20),
  PARENT_ZPRC VARCHAR(32),
  PARENT_ZPRO VARCHAR(32),
  PARTNER VARCHAR(10),
  POS_AGENT_CODE VARCHAR(10),
  POS_AGENT_NAME VARCHAR(100),
  POST_CODE_MER VARCHAR(20),
  PROD_DESC VARCHAR(100),
  PROV_DATE VARCHAR(8),
  PROV_TAT BIGINT,
  PROV_TAT_SEC BIGINT,
  PROV_TIME VARCHAR(6),
  R4G_REGION VARCHAR(20),
  R4G_STATE_NAME VARCHAR(100),
  R4GID VARCHAR(60),
  REGION_MER VARCHAR(60),
  RH_ACTIVATION_DATE VARCHAR(8),
  RH_ACTIVATION_DATETIME VARCHAR(14),
  RH_ACTIVATION_MONTH VARCHAR(6),
  RH_ACTIVATION_TIME VARCHAR(6),
  RH_ACTIVE_PROD_FLG VARCHAR(10),
  RH_ACTUAL_PROD VARCHAR(10),
  UNPSECIFIED_COL_1 VARCHAR(200),
  RH_DIB_CREATION_DATE DATE,
  RH_SEGMENT VARCHAR(20),
  RH_STATUS VARCHAR(20),
  RH_STATUS_NEW VARCHAR(20),
  RH_TERMINATION_DATE VARCHAR(8),
  RH_TERMINATION_DATETIME VARCHAR(14),
  RH_TERMINATION_MONTH VARCHAR(6),
  RH_TERMINATION_TIME VARCHAR(6),
  SALES_ORG VARCHAR(10),
  SERV_DESC VARCHAR(20),
  SERV_TYPE VARCHAR(10),
  UNPSECIFIED_COL_2 VARCHAR(50),
  SHARED_CONTRACT VARCHAR(20),
  SID VARCHAR(3),
  SUSPENDED_TIMESTAMP TIMESTAMP,
  TERMINATION_FLG VARCHAR(5),
  TIB_FAIL_FLG VARCHAR(2),
  TIBCO_ACT_NAME VARCHAR(100),
  TIBCO_ACT_STAT VARCHAR(50),
  TIBCO_FAIL_DATE VARCHAR(8),
  TIME_TAKEN_TV BIGINT,
  TIME_TAKEN_TV_SEC BIGINT,
  TITLE VARCHAR(50),
  TV_PEND_DATE VARCHAR(8),
  TV_PEND_DATETIME VARCHAR(14),
  TV_PEND_TAT BIGINT,
  TV_PEND_TIME VARCHAR(6),
  TV_REJ_DATE VARCHAR(8),
  TV_REJ_TAT BIGINT,
  TV_REJ_TIME VARCHAR(6),
  TV_STATUS VARCHAR(50),
  TV_SUC_DATE VARCHAR(8),
  TV_SUC_TAT BIGINT,
  TV_SUC_TAT_SEC BIGINT,
  TV_SUC_TIME VARCHAR(6),
  TV_TYPE VARCHAR(50),
  UNBARRING_TAT BIGINT,
  UNBARRING_TAT_SEC BIGINT,
  VIP_LEVEL VARCHAR(50),
  WIFI_ID VARCHAR(50),
  YH_HANAUPDTIMESTAMP TIMESTAMP,
  YH_HANAUPDTIMESTAMP_1 TIMESTAMP,
  YYBULK_REF_NUM VARCHAR(40),
  YYCIRCLE_ID VARCHAR(20),
  YYEXT_REF_NUM VARCHAR(50),
  YYMNP_RELEVANCE VARCHAR(10),
  YYPLANOFFER VARCHAR(10),
  YYSIMNO VARCHAR(50),
  YYSTARTERKIT VARCHAR(20),
  YYVANITY_CODE VARCHAR(30),
  ZPRC_ITEM_STATUS VARCHAR(10),
  ZPRC_ITEM_STATUS_DESC VARCHAR(200),
  ZPRO_HDR_DATE VARCHAR(8),
  ZPRO_HDR_DATETIME VARCHAR(14),
  ZPRO_HDR_STATUS VARCHAR(20),
  ZPRO_HDR_STATUS_DESC VARCHAR(200),
  ZPRO_HDR_TIME VARCHAR(6),
  ZPRO_ITEM_DATE VARCHAR(8),
  ZPRO_ITEM_DATETIME VARCHAR(14),
  ZPRO_ITEM_STATUS VARCHAR(10),
  ZPRO_ITEM_STATUS_DESC VARCHAR(200),
  ZPRO_ITEM_TIME VARCHAR(6),
  SUSPENDED_REASON STRING,
  SUSPENDED_REASON_DESC STRING,
  RH_LOAD_TIME TIMESTAMP
) 
partitioned by (R4G_STATE VARCHAR(2))
STORED AS ORC;

insert into ZEC1_ZPRC_ITEMS_TEST 
select 
ACCOUNT_ID,
ACQUISITION_TYPE,
replace(cast(ACTIVATION_DATE as string),'-','') as ACTIVATION_DATE,
ACTIVATION_FLG,
ACTIVATION_TIME,
AGEONNET,
AUTH_PERSON_NAME,
AUTHORIZED_SIGN_ID,
BILLING_CYCLE,
BILLING_MEDIA,
BILLING_TYPE_CODE,
BILLING_TYPE_TEXT,
replace(cast(CAF_APP_DATE as string),'-','') as CAF_APP_DATE,
CAF_APP_TAT,
CAF_APP_TAT_SEC,
CAF_APP_TIME,
CAF_NUMBER,
replace(cast(CAF_PEND_DATE as string),'-','') as CAF_PEND_DATE,
CAF_PEND_DATETIME,
CAF_PEND_TAT,
CAF_PEND_TIME,
replace(cast(CAF_REJ_DATE as string),'-','') as CAF_REJ_DATE,
CAF_REJ_TAT,
CAF_REJ_TIME,
CAF_STATUS,
replace(cast(CANC_DATE as string),'-','') as CANC_DATE,
CANC_TIME,
CATEGORY_LEVEL,
CIRCLE_NAME,
CITY_MER,
replace(cast(COMP_DATE as string),'-','') as COMP_DATE,
COMP_TAT,
COMP_TAT_SEC,
COMP_TIME,
CONSUMER_TYPE,
CONSUMER_TYPE_DESC,
CONTRACT_ID,
COUNTRY_MER,
CREATED_ON,
CREATED_ON_DATETIME,
CREATED_ON_TIME,
replace(cast(CREATION_DATE as string),'-','') as CREATION_DATE,
CREATION_TIME,
CUST_AREA,
CUST_BUILDING,
CUST_CITY,
CUST_COUNTRY,
CUST_JC,
CUST_JC_DESC,
CUST_JOB,
CUST_JOB_TXT,
CUST_POST_CODE,
CUST_REGION,
CUST_SEGMENT_CODE,
CUST_SEGMENT_TEXT,
CUST_STATE_DESC,
CUSTOMER_AGE,
DATE_OF_BIRTH,
DEVICE_MAKE,
DEVICE_MODEL,
DIS_CHANNEL,
DIST_CHNL_TXT,
DIVISION,
DRAFT_DIST_CHNL,
DRAFT_DIST_CHNL_TEXT,
DRAFT_ORDER,
EKYC_FLAG,
ENT_TYPE,
FIRST_NAME,
FTTX_CITY_CODE,
FTTX_CITY_NAME,
FTTX_JC_CODE,
FTTX_JC_RJID,
FTTX_STATE_NAME,
FTTX_SUBCITY_NAME,
GENDER,
GUID_ITEM_ZPRC,
GUID_ITEM_ZPRO,
HEADER_ZPRC,
HEADER_ZPRO,
HEADQUARTER_ID,
HEADQUARTER_TYPE,
IMSI,
replace(cast(JIO_PRIME_DATE as string),'-','') as JIO_PRIME_DATE,
JIO_PRIME_FLAG,
JIO_PRIME_TIMESTAMP,
JIOCENTER_SAP_ID,
LAST_NAME,
LATEST_ZPRC_GUID,
LOCATION_ID,
LOCATION_NAME,
LOCATION_TYPE,
MACID,
MANDT,
MASTER_AGREEMENT_ID,
MER_JC_STATE_NAME,
MER_STATE_NAME,
MERCHANT_BUILDING,
MERCHANT_CIRCLE_ID,
MERCHANT_CIRCLE_NAME,
MERCHANT_CODE,
MERCHANT_JC,
MERCHANT_JC_CITY,
MERCHANT_JC_PINCODE,
MERCHANT_JC_STATE,
MERCHANT_JC_TEXT,
MERCHANT_NAME,
MIDDLE_NAME,
MNP_DONOR_CODE,
MNP_DONOR_TEXT,
MNP_FLAG,
MOBILE_NO,
MSG_STATE_PCEA,
MSG_TYPE,
MSISDN,
OFFER_CODE,
OFFER_DESC,
ORDER_ORIGINATED_FLAG,
ORDERED_PROD,
ORDERID,
ORG_NAME,
OWNERSHIP,
PARENT_ZPRC,
PARENT_ZPRO,
PARTNER,
POS_AGENT_CODE,
POS_AGENT_NAME,
POST_CODE_MER,
PROD_DESC,
replace(cast(PROV_DATE as string),'-','') as PROV_DATE,
PROV_TAT,
PROV_TAT_SEC,
PROV_TIME,
R4G_REGION,
R4G_STATE_NAME,
R4GID,
REGION_MER,
replace(cast(RH_ACTIVATION_DATE as string),'-','') as RH_ACTIVATION_DATE,
RH_ACTIVATION_DATETIME,
RH_ACTIVATION_MONTH,
RH_ACTIVATION_TIME,
RH_ACTIVE_PROD_FLG,
RH_ACTUAL_PROD,
UNPSECIFIED_COL_1,
replace(cast(RH_DIB_CREATION_DATE as string),'-','') as RH_DIB_CREATION_DATE,
RH_SEGMENT,
RH_STATUS,
RH_STATUS_NEW,
replace(cast(RH_TERMINATION_DATE as string),'-','') as RH_TERMINATION_DATE,
RH_TERMINATION_DATETIME,
RH_TERMINATION_MONTH,
RH_TERMINATION_TIME,
SALES_ORG,
SERV_DESC,
SERV_TYPE,
UNPSECIFIED_COL_2,
SHARED_CONTRACT,
SID,
SUSPENDED_TIMESTAMP,
TERMINATION_FLG,
TIB_FAIL_FLG,
TIBCO_ACT_NAME,
TIBCO_ACT_STAT,
replace(cast(TIBCO_FAIL_DATE as string),'-','') as TIBCO_FAIL_DATE,
TIME_TAKEN_TV,
TIME_TAKEN_TV_SEC,
TITLE,
replace(cast(TV_PEND_DATE as string),'-','') as TV_PEND_DATE,
TV_PEND_DATETIME,
TV_PEND_TAT,
TV_PEND_TIME,
replace(cast(TV_REJ_DATE as string),'-','') as TV_REJ_DATE,
TV_REJ_TAT,
TV_REJ_TIME,
TV_STATUS,
replace(cast(TV_SUC_DATE as string),'-','') as TV_SUC_DATE,
TV_SUC_TAT,
TV_SUC_TAT_SEC,
TV_SUC_TIME,
TV_TYPE,
UNBARRING_TAT,
UNBARRING_TAT_SEC,
VIP_LEVEL,
WIFI_ID,
YH_HANAUPDTIMESTAMP,
YH_HANAUPDTIMESTAMP_1,
YYBULK_REF_NUM,
YYCIRCLE_ID,
YYEXT_REF_NUM,
YYMNP_RELEVANCE,
YYPLANOFFER,
YYSIMNO,
YYSTARTERKIT,
YYVANITY_CODE,
ZPRC_ITEM_STATUS,
ZPRC_ITEM_STATUS_DESC,
replace(cast(ZPRO_HDR_DATE as string),'-','') as ZPRO_HDR_DATE,
ZPRO_HDR_DATETIME,
ZPRO_HDR_STATUS,
ZPRO_HDR_STATUS_DESC,
ZPRO_HDR_TIME,
replace(cast(ZPRO_ITEM_DATE as string),'-','') as ZPRO_ITEM_DATE,
ZPRO_ITEM_DATETIME,
ZPRO_ITEM_STATUS,
ZPRO_ITEM_STATUS_DESC,
ZPRO_ITEM_TIME,
SUSPENDED_REASON,
SUSPENDED_REASON_DESC,
RH_LOAD_TIME,
R4G_STATE

from foo;

