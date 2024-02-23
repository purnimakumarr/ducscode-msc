/*
 * WAP to implement/using variable is private, finalizer and print/show the results. All inputs are available in programs/ runtime.
 */

 import java.util.Scanner;

public class FinalizerDemo {
  private int x;

  FinalizerDemo(int x) {
    this.x = x;
  }
  protected void finalize() throws Throwable {
    try {
      System.out.println("Inside FinalizerDemo's finalize()");
    } catch (Throwable e) {
      throw e;
    } finally {
      System.out.println("Calling finalize method of the Object class");
      super.finalize();
    }
  }
 
  public static void main(String[] args) throws Throwable{
    int num;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    num = scanner.nextInt();

    FinalizerDemo d = new FinalizerDemo(num);
    d.finalize();

    System.out.println("The value of private variable x: " + d.x);

    scanner.close();
  }
}
