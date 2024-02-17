/*
 * WAP to implement all operators- addition, subtraction, multiplication, division, modulus and print those values. All input/show is available in programs.
 */

 import java.util.Scanner;

 public class LogicalOperations {
  public static void main(String[] args) {  
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the first integer: ");
    int firstNumber = scanner.nextInt();
    scanner.nextLine();

    System.out.print("Enter the second integer: ");
    int secondNumber = scanner.nextInt();
    System.out.println("You entered: " + firstNumber + " and " + secondNumber);

    int res;

    res = firstNumber + secondNumber;
    System.out.println(firstNumber + " + " + secondNumber + ": " + res);

    res = firstNumber -  secondNumber;
    System.out.println(firstNumber + " - " + secondNumber + ": " + res);

    if(secondNumber == 0) {
      System.out.println("Cannot divide by zero.");
    } else {
      res = firstNumber / secondNumber;
      System.out.println(firstNumber + " / " + secondNumber + ": " + res);
    }

    res = firstNumber * secondNumber;
    System.out.println(firstNumber + " * " + secondNumber + ": " + res);

    res = firstNumber % secondNumber;
    System.out.println(firstNumber + " % " + secondNumber + ": " + res);

    scanner.close();
  }
}