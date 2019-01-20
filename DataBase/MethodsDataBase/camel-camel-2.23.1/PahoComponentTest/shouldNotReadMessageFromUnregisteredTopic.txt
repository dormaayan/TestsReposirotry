@Test public void shouldNotReadMessageFromUnregisteredTopic() throws InterruptedException {
  mock.expectedMessageCount(0);
  template.sendBody("paho:someRandomQueue?brokerUrl=tcp://localhost:" + mqttPort,"msg");
  mock.assertIsSatisfied();
}
