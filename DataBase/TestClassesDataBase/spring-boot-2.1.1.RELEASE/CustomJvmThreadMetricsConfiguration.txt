@Configuration static class CustomJvmThreadMetricsConfiguration {
  @Bean public JvmThreadMetrics customJvmThreadMetrics(){
    return new JvmThreadMetrics();
  }
}
