/*
 * WAP to implement the vector and print/show the results. All inputs are available in programs/ runtime.
 */

 import java.util.*;

public class VectorDemo {
  public static void main(String[] args) {
    Vector<Integer> vector = new Vector<Integer>(5);

    for(int i  = 0; i < 5; i++) {
      vector.add(i);
    }

    System.out.println("Elements of vector are " + vector);
    System.out.println("Size of the vector is " + vector.size());

    vector.remove(2);

    System.out.println("After removing second element, the vector is " + vector);

    vector.set(3, 10);

    System.out.println("Fourth element is replaced with 10. New vector is " + vector);
  }
  
}
