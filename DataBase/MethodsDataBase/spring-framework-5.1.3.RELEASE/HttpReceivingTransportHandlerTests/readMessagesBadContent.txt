@Test public void readMessagesBadContent() throws Exception {
  this.servletRequest.setContent("".getBytes("UTF-8"));
  handleRequestAndExpectFailure();
  this.servletRequest.setContent("[\"x]".getBytes("UTF-8"));
  handleRequestAndExpectFailure();
}
