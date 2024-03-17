public class NestedClass {

  private String outer_class_name = "Nested Class";

  class InnerClass {

    public void print() {
      System.out.print(outer_class_name);
    }
  }

  void test() {
    InnerClass inner = new InnerClass();
    inner.print();
  }

  public static void main(String[] args) {
    NestedClass nested = new NestedClass();
    nested.test();
  }
}
