@Test public void readmeSampleWhenRequestSecureResourceThenRedirectToLogin() throws Exception {
  this.spring.register(SampleWebSecurityConfigurerAdapter.class).autowire();
  this.springSecurityFilterChain.doFilter(this.request,this.response,this.chain);
  assertThat(this.response.getRedirectedUrl()).isEqualTo("http://localhost/login");
}
