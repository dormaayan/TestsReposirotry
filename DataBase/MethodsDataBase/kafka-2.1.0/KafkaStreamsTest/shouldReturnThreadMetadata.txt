@Test public void shouldReturnThreadMetadata(){
  globalStreams.start();
  final Set<ThreadMetadata> threadMetadata=globalStreams.localThreadsMetadata();
  assertNotNull(threadMetadata);
  assertEquals(2,threadMetadata.size());
  for (  final ThreadMetadata metadata : threadMetadata) {
    assertTrue("#threadState() was: " + metadata.threadState() + "; expected either RUNNING, PARTITIONS_REVOKED, PARTITIONS_ASSIGNED, or CREATED",Utils.mkList("RUNNING","PARTITIONS_REVOKED","PARTITIONS_ASSIGNED","CREATED").contains(metadata.threadState()));
    assertEquals(0,metadata.standbyTasks().size());
    assertEquals(0,metadata.activeTasks().size());
  }
}
