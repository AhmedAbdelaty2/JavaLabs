
import java.awt.*;
import java.applet.*;

public class task1 extends Applet {
    Image img;

    public void init() {
        img = getImage(getDocumentBase(), "11.png");
    }

    public void paint(Graphics g) {
     
        g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
    }
}