import java.applet.Applet;
import java.awt.Graphics;

public class HelloApplet extends Applet
{
    public void paint(Graphics g)
    {
        g.drawString("Hello Java", 50, 100);
        String str = getParameter("hi");
        g.drawString(str, 60, 200);
        System.out.println(str);
    }
}