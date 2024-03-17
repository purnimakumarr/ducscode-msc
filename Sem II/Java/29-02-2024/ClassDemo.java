/*
 * WAP to implement method, class method, passing arguments to method and print/show the results. All inputs are available in programs/ runtime
 */
public class ClassDemo {
  public void print(String message) {
    System.out.print(message);
  }
  public static void main(String[] args) {
    ClassDemo obj = new ClassDemo();
    obj.print("Hello World");
  }
}
