@Test public void shouldReadMessageFromCustomizedComponent() throws InterruptedException {
  String msg="msg";
  testCustomizedPahoMock.expectedBodiesReceived(msg);
  template.sendBody("direct:testCustomizedPaho",msg);
  testCustomizedPahoMock.assertIsSatisfied();
}
