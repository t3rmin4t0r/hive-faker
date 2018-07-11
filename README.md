# hive-faker
Fake data UDFs and UDTFs for Hive

	set mapred.reduce.tasks=1024;
	create temporary function generate_series as 'org.notmysock.hive.udf.GenerateSeriesUDTF';
	create temporary table foo stored as orc as 
	with c as (select generate_series(200*1000)),
	cc as (select seq_0 as i from c cluster by i)
	select generate_TABLE(i, 1000) from cc;

