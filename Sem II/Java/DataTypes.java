/* 
 * Objective: WAP to implement data types- int, short, float, string and print/show that data types. All input is available in programs.  
*/

public class DataTypes {
  public static void main(String[] args) {
    int num = 5; 
    short s = 10000;              
    float floatNum = 5.99f;               
    String text = "Hello";     
    System.out.println("Printing some data types in Java:-");
    System.out.println("num = " + num + " " + ((Object)num).getClass().getSimpleName());
    System.out.println("s = " + s + " " + ((Object)s).getClass().getSimpleName());
    System.out.println("floatNum = " + floatNum + " " + ((Object)floatNum).getClass().getSimpleName());
    System.out.println("test  = " + text + " " + text.getClass().getSimpleName());
  }
}