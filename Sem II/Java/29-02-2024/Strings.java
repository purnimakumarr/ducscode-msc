/*
 * WAP to implement/using Strings of all method/operation- length, concat, trim, etc and print/show the results. All inputs are available in programs/ runtime.
 */
public class Strings {
  public static void main(String[] args) {
    String greeting = "Hello World";
    System.out.println(greeting);
    System.out.println("The length of string 'Hello World' is " + greeting.length());
    String message = "My name is Purnima Kumar.";
    String new_msg = greeting.concat(", " + message);
    System.out.println(new_msg);
    System.out.println("      The author of this program is Purnima Kumar.    ".trim());
    System.out.println("The string 'HELLO WORLD' in lowercase is " + "HELLO WORLD".toLowerCase());
    System.out.println("The string 'hello world' in uppercase is " + "hello world".toUpperCase());
  }
}
