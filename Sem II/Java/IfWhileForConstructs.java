/*
 * WAP to implement if construct like- print season, conditional operator, while loop like- print fibonacci series, for loop like- print odd numbers and print/show the values. All input is available in programs.
 */

import java.util.Scanner;

public class IfWhileForConstructs {

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter current mont as integer: ");
    int month = scanner.nextInt();

    String season;

    if(month == 3 || month == 4 || month == 5) {
      season = "Spring";
    } else if(month == 6 || month == 7 || month == 8) {
      season = "Summer";
    } else if(month == 9 || month == 10 || month == 11) {
      season = "Autumn";
    } else if(month == 12 || month == 1 || month == 2) {
      season = "Winter";
    } else {
      season = "Bogus Month";
    }

    System.out.println("The entered month is in the " + season);
    
    int seed = 0, seed1 = 1, fibonacci, i = 2;

    System.out.print("Enter an integer: ");
    int num = scanner.nextInt();

    System.out.print(seed + "\t" + seed1 + "\t");

    while(i < num) {
      fibonacci = seed + seed1;
      System.out.print(fibonacci + "\t");
      seed = seed1;
      seed1 = fibonacci;
      i++;
    }

    System.out.println();

    for(int j = 0; j < 100; j++) {
      if(j % 2 == 0) {
        System.out.println(j + " is even.");
      } else {
        System.out.println(j + " is odd.");
      }
    }
    
    scanner.close();
  }
}
