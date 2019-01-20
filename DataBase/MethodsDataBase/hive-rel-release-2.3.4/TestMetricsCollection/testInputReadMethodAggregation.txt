@Test public void testInputReadMethodAggregation(){
  MetricsCollection collection=new MetricsCollection();
  long value=taskValue(1,1,1);
  Metrics metrics1=new Metrics(value,value,value,value,value,value,value,new InputMetrics(value),null,null);
  Metrics metrics2=new Metrics(value,value,value,value,value,value,value,new InputMetrics(value),null,null);
  collection.addMetrics(1,1,1,metrics1);
  collection.addMetrics(1,1,2,metrics2);
  Metrics global=collection.getAllMetrics();
  assertNotNull(global.inputMetrics);
}
