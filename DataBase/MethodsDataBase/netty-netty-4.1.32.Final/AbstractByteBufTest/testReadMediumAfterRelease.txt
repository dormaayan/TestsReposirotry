@Test(expected=IllegalReferenceCountException.class) public void testReadMediumAfterRelease(){
  releasedBuffer().readMedium();
}
