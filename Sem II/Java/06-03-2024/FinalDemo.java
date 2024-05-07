public class FinalDemo {
  final private String className = "FinalDemo";
  
  void show() {
    System.out.println("className  = " + className);
  }

  final void meth() {
    System.out.println("This is a final method");
  }

  public static void main(String[] args) {
    FinalDemo f = new FinalDemo();
    f.show();
    f.meth();
  }
}
