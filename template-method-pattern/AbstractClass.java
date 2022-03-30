public abstract class AbstractClass {
  //template method, not able to override it
  //defines the structure of an algorithm
  final void template() {
    step1();
    step2();
    step3();

    hook();
  }

  void step1() {
    System.out.println("Step 1 default implementation.");
  }
  //subclass needs to provide implementations
  //of the following two methods
  abstract void step2();

  abstract  void step3();

  void hook() {
    //empty or default implementation
    //subclass can override or leave it
    //depending on the context
  }
  
}