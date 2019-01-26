@Test public void serverCloseBreaksReadMessageLoop() throws IOException {
  server.webSocket.send("Hello!");
  server.webSocket.close(1000,"Bye!");
  assertTrue(client.processNextFrame());
  client.listener.assertTextMessage("Hello!");
  assertFalse(client.processNextFrame());
  client.listener.assertClosing(1000,"Bye!");
}
