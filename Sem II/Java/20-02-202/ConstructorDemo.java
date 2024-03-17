/*
 * WAP to implement/using constructor, calling another constructor and print/show the results. All inputs are available in programs/ runtime.
 */

import java.util.Scanner;

public class ConstructorDemo {
  int i, j;
  ConstructorDemo(int a, int b) {
    i = a;
    j = b;
  }

  ConstructorDemo() {
    this(-1, -1);
  }

  int addition() {
    return i + j;
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int num1, num2;
    System.out.print("Input first number: ");
    num1 = scanner.nextInt();
    System.out.print("Input second number: ");
    num2 = scanner.nextInt();

    ConstructorDemo obj = new ConstructorDemo(num1, num2);
    System.out.println("The sum of the numbers is: " + obj.addition());
    scanner.close();

    ConstructorDemo obj1 = new ConstructorDemo();
    System.out.println("The result by calling another constructor: " + "obj1.i = " + obj1.i + " obj1.j = " + obj1.j);
  }
}
