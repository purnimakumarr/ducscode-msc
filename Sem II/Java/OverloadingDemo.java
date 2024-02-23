/*
 * WAP to implement/using this keyword, overloading method and print/show the results. All inputs are available in programs/ runtime.
 */

class Circle {
  private float radius;

  Circle(float radius) {
    this.radius = radius;
  }

  void test() {
    System.out.println("The new radius is " + radius);
  }

  void test(float i) {
    System.out.println("The new radius is " + (radius + i));
  }

  void test(int i) {
    System.out.println("The new radius is " + (radius * i));
  }
}

public class OverloadingDemo {

  public static void main(String[] args) {
    Circle mycircle = new Circle(5);
    Circle mycircle1 = new Circle(7);
    mycircle.test();
    mycircle.test(2.0f);
    mycircle1.test(2);
  }
}
