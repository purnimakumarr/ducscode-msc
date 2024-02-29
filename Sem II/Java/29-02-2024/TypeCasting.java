/*
 * WAP to implement/using casting and print/show the results. All inputs are available in programs/ runtime.
 */

public class TypeCasting {
  public static void main(String[] args) {
    int myInt = 10;
    double myDouble = myInt;
    System.out.println("Widening Casting");
    System.out.println("myInt = " + myInt);
    System.out.println("myDouble = " + myDouble);
    System.out.println();

    myDouble = 4.5678d;
    myInt = (int) myDouble;
    System.out.println("Narrowing Casting");
    System.out.println("myDouble = " + myDouble);
    System.out.println("myInt = " + myInt);
  }
}
