@Test public void shouldReadMessage() throws Exception {
  String messageRead=camelItemReader.read();
  assertEquals(message,messageRead);
}
