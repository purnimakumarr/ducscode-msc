import java.applet.Applet;
import java.awt.Graphics;
public class AddressApplet {
  public void paint(Graphics g) {
    g.drawString("ABC", 50, 50);
    g.drawString("123 Main Street", 50, 70);
    g.drawString("Antown, USA", 50, 90);
  }
}
