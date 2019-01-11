@Test(expected=IllegalArgumentException.class) public void readMessagesNoSession() throws Exception {
  WebSocketHandler webSocketHandler=mock(WebSocketHandler.class);
  new XhrReceivingTransportHandler().handleRequest(this.request,this.response,webSocketHandler,null);
}
