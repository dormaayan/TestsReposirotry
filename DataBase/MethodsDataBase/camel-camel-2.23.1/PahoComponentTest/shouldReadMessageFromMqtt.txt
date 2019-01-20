@Test public void shouldReadMessageFromMqtt() throws InterruptedException {
  String msg="msg";
  mock.expectedBodiesReceived(msg);
  template.sendBody("direct:test",msg);
  mock.assertIsSatisfied();
}
