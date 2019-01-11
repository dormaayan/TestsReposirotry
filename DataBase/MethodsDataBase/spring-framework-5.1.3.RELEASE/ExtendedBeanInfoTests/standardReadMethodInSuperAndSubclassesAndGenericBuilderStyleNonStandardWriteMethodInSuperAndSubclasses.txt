@Test public void standardReadMethodInSuperAndSubclassesAndGenericBuilderStyleNonStandardWriteMethodInSuperAndSubclasses() throws Exception {
abstract class B<This extends B<This>> {
    @SuppressWarnings("unchecked") protected final This instance=(This)this;
    private String foo;
    public String getFoo(){
      return foo;
    }
    public This setFoo(    String foo){
      this.foo=foo;
      return this.instance;
    }
  }
class C extends B<C> {
    private int bar=-1;
    public int getBar(){
      return bar;
    }
    public C setBar(    int bar){
      this.bar=bar;
      return this.instance;
    }
  }
  C c=new C().setFoo("blue").setBar(42);
  assertThat(c.getFoo(),is("blue"));
  assertThat(c.getBar(),is(42));
  BeanInfo bi=Introspector.getBeanInfo(C.class);
  assertThat(hasReadMethodForProperty(bi,"foo"),is(true));
  assertThat(hasWriteMethodForProperty(bi,"foo"),is(false));
  assertThat(hasReadMethodForProperty(bi,"bar"),is(true));
  assertThat(hasWriteMethodForProperty(bi,"bar"),is(false));
  BeanInfo ebi=new ExtendedBeanInfo(bi);
  assertThat(hasReadMethodForProperty(bi,"foo"),is(true));
  assertThat(hasWriteMethodForProperty(bi,"foo"),is(false));
  assertThat(hasReadMethodForProperty(bi,"bar"),is(true));
  assertThat(hasWriteMethodForProperty(bi,"bar"),is(false));
  assertThat(hasReadMethodForProperty(ebi,"foo"),is(true));
  assertThat(hasWriteMethodForProperty(ebi,"foo"),is(true));
  assertThat(hasReadMethodForProperty(ebi,"bar"),is(true));
  assertThat(hasWriteMethodForProperty(ebi,"bar"),is(true));
}
