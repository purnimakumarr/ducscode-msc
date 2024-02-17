/*
 * WAP to implement increment, decrement and operator- comparison, logical, bitwise and print the values. All input/show is available in programs
 */

 import java.util.Scanner;

public class UnaryBitwiseOperators {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int num = scanner.nextInt();

    int buffer = num;
    System.out.println(num + "++ : " + num++);
    num = buffer;
    System.out.println(num + "-- : " + num--);
    num = buffer;
    System.out.println("++" + num + ": " + ++num);
    num = buffer;
    System.out.println("--" + num + ": " + --num);
    num = buffer;
    
    System.out.print("Enter another number: ");
    int num1 = scanner.nextInt();

    if(num < num1) {
      System.out.println(num + " < " + num1);
    } else if(num1 < num) {
      System.out.println(num1 + " < " + num);
    } else {
      System.out.println(num + " = " + num1);
    }

    System.out.println(num + "&" + num1 + " : " + (num&num1));
    System.out.println(num + "|" + num1 + " : " + (num|num1));
    System.out.println(num + "^" + num1 + " : " + (num^num1));
    System.out.println("~" + num + " : " + (~num));
    scanner.close();
  }
}
