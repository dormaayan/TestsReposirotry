@Test(expected=IllegalReferenceCountException.class) public void testReadMediumLEAfterRelease(){
  releasedBuffer().readMediumLE();
}
