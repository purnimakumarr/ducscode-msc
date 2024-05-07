import java.io.File;

public class DirList {
  public static void main(String args[]) {
    String dirname="D:/GitHub/ducscode-msc/Sem II/Java/03-04-2024";
    File f1 = new File(dirname);

    if(f1.isDirectory()) {
      System.out.println("directory of " + dirname);
      String s[] = f1.list();

      for(int i = 0; i < s.length; i++) {
        File f = new File(dirname + "/" + s[i]);
        if(f.isDirectory()) {
          System.out.println(s[i] + " is a directory");
        } else {
          System.out.print(s[i] + " is a file");
          System.out.print(f.canWrite() ? " : writable" : "\n");
          System.out.print(f.canRead() ? " : readable\n" : "\n");
        }
      }
    } else {
      System.out.println(dirname + " is not a directory");
    }
  }    
}
