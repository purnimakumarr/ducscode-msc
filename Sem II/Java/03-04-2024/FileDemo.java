import java.io.File;

public class FileDemo {
  static void p(String s) {
    System.out.println(s);
  }   
  public static void main(String args[]) {
    File f1 = new File("D:/GitHub/ducscode-msc/Sem II/Java/03-04-2024");
    p("File name: " + f1.getName());
    p("Path: " + f1.getPath());
    p("Parent: " + f1.getParent());
    p(f1.exists() ? "exists" : "does not exist");
    p(f1.isFile() ? "is normal file" : "might be a named pipe");
  }
}
