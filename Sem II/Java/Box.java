/*
 * WAP to implement/using overloading constructor, inner class and print/show the results. All inputs are available in programs/ runtime.
 */

public class Box {
  double width, height, depth;
  
  Box(double w, double h, double d) {
    width = w;
    height = h;
    depth = d;
  }

  Box() {
    width = -1;
    height = -1;
    depth = -1;
  }

  Box(double len) {
    width = height = depth = len;
  }

  double volume() {
    return depth * height * width;
  }

    public static void main(String[] args) {
      Box mybox1 = new Box(10, 20, 15);
      Box mybox2 = new Box();
      Box mybox3 = new Box(7);

      double volume;

      volume = mybox1.volume();
      System.out.println("The volume of mybox1: " + volume);

      volume = mybox2.volume();
      System.out.println("The volume of mybox2: " + volume);

      volume = mybox3.volume();
      System.out.println("The volume of myBox3: " + volume);
    }
}
