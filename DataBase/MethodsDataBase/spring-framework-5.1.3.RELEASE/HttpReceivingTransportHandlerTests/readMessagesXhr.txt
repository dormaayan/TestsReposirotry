@Test public void readMessagesXhr() throws Exception {
  this.servletRequest.setContent("[\"x\"]".getBytes("UTF-8"));
  handleRequest(new XhrReceivingTransportHandler());
  assertEquals(204,this.servletResponse.getStatus());
}
