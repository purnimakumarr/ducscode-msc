public class ThrowsDemo {
  static void throwOne() throws IllegalAccessException {
    System.out.println("Inside thowOne.");
    throw new IllegalAccessException("demo");
  }
  public static void main(String args[]) {
    try {
      int a = args.length;
      int b = 42 / a;
      System.out.println("a = " + a);

      try {
        if(a == 1) {
          a = a / (a-a);
        } 

        if(a == 2) {
          int c[] = {1};
          c[42] = 99;
        }
      } catch(ArrayIndexOutOfBoundsException e) {
        System.out.println("Array index out-of-bounds: " + e);
      }
      throwOne();
    } catch(ArithmeticException e) {
      System.out.println("Divide by 0: " + e);
    } catch(IllegalAccessException e) {
      System.out.println("Caught " + e);
    } finally {
      System.out.println("This code will always execute");
    }
  }
}
