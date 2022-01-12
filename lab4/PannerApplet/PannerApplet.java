import java.applet.Applet;
import java.awt.Graphics;
import java.lang.*;
import java.awt.FontMetrics;

public class PannerApplet extends Applet implements Runnable
{
    String s = new String("Java Wrold");
    Thread th;
    int x = 0;
    int len;

    public void init()
    {
        th = new Thread(this);
        th.start();
    }

    public void paint(Graphics g)
    {
        g.drawString(s, x, 100);
        FontMetrics metrics = g.getFontMetrics();
        len = metrics.stringWidth(s);
    }

    public void run()
    {
        while(true)
        {
            if(x>getWidth())
            {
                x = -len;
            }
            else
            {
                x++;
            }
            repaint();
            try{
            Thread.sleep(10);
            }
            catch(InterruptedException e)
            {}
        }
    }
}