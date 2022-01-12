import java.awt.*;
import java.applet.*;

public class task3 extends Applet 
{
    public void paint(Graphics g) 
    {
        Color c = new Color(255,255,153);
        g.setColor(c);
        g.fillOval(77, 6, 306, 65);
        g.fillOval(60, 144, 57, 91);
        g.fillOval(341, 144, 57, 91);
        g.fillOval(167, 105, 128, 186);

        g.setColor(Color.BLACK);
        g.drawOval(77, 6, 306, 65);
        g.drawLine(77, 38, 31, 262);
        g.drawLine(383, 38, 429, 262);
        g.drawOval(60, 144, 57, 91);
        g.drawOval(341, 144, 57, 91);
        g.drawOval(167, 105, 128, 186);
        g.drawArc(31, 180, 398, 160, 0, -180);
        g.drawLine(216, 342, 187, 454);
        g.drawLine(236, 342, 264, 454);
        g.drawRect(80, 454, 292, 32);
    }
}