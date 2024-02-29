/*
 * WAP to implement/using inheritance and print/show the results. All inputs are available in programs/ runtime.
 */

import java.util.Scanner;
import java.lang.Math;

abstract class Shape {
  int width;
  abstract void area();
  abstract void perimeter();

  Shape(int width) {
    this.width = width;
  }
}

class Square extends Shape {
  int area, perimeter;
  Square(int width) {
    super(width);
  }

  void area() {
    area = this.width * this.width;
  }

  void perimeter() {
    perimeter = 4 * this.width;
  }
}

class Rectangle extends Shape {
  int height, area, perimeter;
  Rectangle(int width, int height) {
    super(width);
    this.height = height;
  }

  void area() {
    area = this.width * this.height;
  }

  void perimeter() {
    perimeter = 2 * (this.width + this.height);
  }
}

class Circle extends Shape {
  double pie = Math.PI;
  double area, perimeter;
  Circle(int radius) {
    super(radius);
  }

  void area() {
    area = this.pie * Math.pow(this.width, 2);
  }

  void perimeter() {
    perimeter = 2 * this.pie * this.width;
  }
}

public class InheritanceDemo {

  int printOperationsMenu() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("\nOperations\n---------");
    System.out.println("1. Area");
    System.out.println("2. Perimeter");
    System.out.print("\nEnter operation code: ");
    int choice = scanner.nextInt();

    scanner.close();
    return choice;
  }
  public static void main(String[] args) {
    System.out.println("Shapes\n---------");
    System.out.println("1. Square");
    System.out.println("2. Rectangle");
    System.out.println("3. Circle");

    Scanner scanner = new Scanner(System.in);
    int choice;
    System.out.print("\nEnter shape code: ");
    choice = scanner.nextInt();

    InheritanceDemo demo = new InheritanceDemo();

    int width, height;
    switch (choice) {
      case 1: 
        System.out.print("Enter width: ");
        width = scanner.nextInt();
        Square s = new Square(width);  
        choice = demo.printOperationsMenu();
        switch(choice) {
          case 1: 
            s.area();
            System.out.println("Area of square is " + s.area);
            break;
          case 2: 
            s.perimeter();
            System.out.println("Perimeter of square is " + s.perimeter);
            break;
          default:
            System.out.println("Invalid choice. Exiting!");
            System.exit(0);
        }
        break;
      case 2: 
        System.out.print("Enter width: ");
        width = scanner.nextInt();
        System.out.print("Enter height: ");
        height = scanner.nextInt();
        Rectangle r = new Rectangle(width, height);
        choice = demo.printOperationsMenu();
        switch(choice) {
          case 1: 
            r.area();
            System.out.println("Area of rectangle is " + r.area);
            break;
          case 2: 
            r.perimeter();
            System.out.println("Perimeter of rectangle is " + r.perimeter);
            break;
          default:
            System.out.println("Invalid choice. Exiting!");
            System.exit(0);
        }
      break;
      case 3: 
        System.out.print("Enter radius: ");
        width = scanner.nextInt();
        Circle c = new Circle(width);
        choice = demo.printOperationsMenu();
        switch(choice) {
          case 1: 
            c.area();
            System.out.println("Area of circle is " + c.area);
            break;
          case 2: 
            c.perimeter();
            System.out.println("Perimeter of circle is " + c.perimeter);
            break;
          default:
            System.out.println("Invalid choice. Exiting!");
            System.exit(0);
        }
      break;
      default: 
        System.out.println("Invalid Choice. Exiting!");
        System.exit(0);
    }
    scanner.close();
  }
}
