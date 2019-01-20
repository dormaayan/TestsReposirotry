@Test public void testEnableHttpSocketReadMetric(){
  assertFalse(AwsSdkMetrics.isHttpSocketReadMetricEnabled());
  AwsSdkMetrics.enableHttpSocketReadMetric();
  assertTrue(AwsSdkMetrics.isHttpSocketReadMetricEnabled());
}
