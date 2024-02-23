/*
 * WAP to implement switch statement, breaks, continue and print/show the values. All input is available in programs/ runtime.
 */

import java.util.Scanner;

public class SwitchDemo {

  public static String getSeason(int month) {
    String season;
    switch(month) {
      case 1:
      case 2:
      case 12: season = "Winter";
      break;
      case 3:
      case 4:
      case 5: season = "Spring";
      break;
      case 6:
      case 7:
      case 8: season = "Summer";
      break;
      case 9:
      case 10:
      case 11: season = "Autumn";
      break;
      default: season = "Bogus Month";
    }
    return season;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter current month as an integer: ");
    int month = scanner.nextInt();
    scanner.close();

    String season = getSeason(month);
    System.out.println("Season is " + season);
  }
}
