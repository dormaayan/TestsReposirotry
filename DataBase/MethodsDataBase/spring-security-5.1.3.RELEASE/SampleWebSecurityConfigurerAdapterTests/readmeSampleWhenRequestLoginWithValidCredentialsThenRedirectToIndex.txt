@Test public void readmeSampleWhenRequestLoginWithValidCredentialsThenRedirectToIndex() throws Exception {
  this.spring.register(SampleWebSecurityConfigurerAdapter.class).autowire();
  this.request.setServletPath("/login");
  this.request.setMethod("POST");
  this.request.addParameter("username","user");
  this.request.addParameter("password","password");
  this.springSecurityFilterChain.doFilter(this.request,this.response,this.chain);
  assertThat(this.response.getRedirectedUrl()).isEqualTo("/");
}
