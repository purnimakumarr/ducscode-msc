/*
 * WAP to calculate area, average 5 nos by calling method and print/show the results. All inputs are available in programs/ runtime.  
 */

import java.util.Scanner;

public class CallingMethod {
  public static void area(int x, int y) {
    System.out.println("The area is " + (x * y));
  }

  public static void average(int num1, int num2, int num3, int num4, int num5) {
    System.out.println("The average is " +  (num1 + num2 + num3 + num4 + num5) / 5);
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the width: ");
    int width = scanner.nextInt();
    System.out.print("Enter the height: ");
    int height = scanner.nextInt();
    area(width, height);

    System.out.print("Enter num1: ");
    int num1 = scanner.nextInt();
    System.out.print("Enter num2: ");
    int num2 = scanner.nextInt();
    System.out.print("Enter num3: ");
    int num3 = scanner.nextInt();
    System.out.print("Enter num4: ");
    int num4 = scanner.nextInt();
    System.out.print("Enter num5: ");
    int num5 = scanner.nextInt();
    average(num1, num2, num3, num4, num5);

    scanner.close();
  }
}
