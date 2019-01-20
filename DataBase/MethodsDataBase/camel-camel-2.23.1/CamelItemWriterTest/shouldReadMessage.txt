@Test public void shouldReadMessage() throws Exception {
  camelItemWriter.write(Collections.singletonList(message));
  assertEquals(message,consumer().receiveBody("seda:queue"));
}
