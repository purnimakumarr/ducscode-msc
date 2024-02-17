/*
 * WAP to implement assignment operator for - addition, subtraction, multiplication, division, modulus and print/show the values. All input is available in programs.

 */

import java.util.Scanner;

public class AssignmentOperators {
  public static void main(String[] args) {  
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the first integer: ");
    int firstNumber = scanner.nextInt();
    scanner.nextLine();

    System.out.print("Enter the second integer: ");
    int secondNumber = scanner.nextInt();
    System.out.println("You entered: " + firstNumber + " and " + secondNumber);

    int buffer = firstNumber;

    firstNumber += secondNumber;
    System.out.println(buffer + " + " + secondNumber + ": " + firstNumber);
    firstNumber = buffer;

    firstNumber -=  secondNumber;
    System.out.println(buffer + " - " + secondNumber + ": " + firstNumber);
    firstNumber = buffer;

    if(secondNumber == 0) {
      System.out.println("Cannot divide by zero.");
    } else {
      firstNumber /= secondNumber;
      System.out.println(buffer + " / " + secondNumber + ": " + firstNumber);
      firstNumber = buffer;
    }

    firstNumber*= secondNumber;
    System.out.println(buffer + " * " + secondNumber + ": " + firstNumber);
    firstNumber = buffer;

    firstNumber %= secondNumber;
    System.out.println(buffer + " % " + secondNumber + ": " + firstNumber);

    scanner.close();
  }
}
