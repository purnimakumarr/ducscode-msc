/*
 * WAP to (i) create instance of class by new operator, (ii) multiple reference of same object and print/show the values of all variables. All inputs are available in programs/ runtime.
 */
class NewBox {
  double width;
  double height;
  double depth;

  NewBox(double w, double h, double d) {
    width = w;
    height = h;
    depth = d;
  }

  void volume() {
    System.out.println("The volume is " + (width * height * depth));
  }
}

public class BoxDemo {
  public static void main(String[] args) {
    NewBox mybox = new NewBox(12, 12, 12);
    System.out.println("The dimensions of mybox are");
    System.out.println("Width: " + mybox.width + " Height: " + mybox.height + " Depth: " + mybox.depth);
    mybox.volume();

    NewBox copybox = mybox;
    mybox = null;
    System.out.println("The dimensions of copybox are");
    System.out.println("Width: " + copybox.width + " Height: " + copybox.height + " Depth: " + copybox.depth);
    copybox.volume();

  }
}
