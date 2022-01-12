import java.awt.*;
import java.awt.Font;

import javafx.scene.canvas.GraphicsContext;
import java.applet.*;

public class task2 extends Applet 
{
    String [] s = Toolkit.getDefaultToolkit().getFontList();
    String [] s2 = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
    public void paint(Graphics g) 
    {
        for(int i=0;i<s.length;i++)
        {
            Font f = new Font(s[i], Font.BOLD, 25);
            g.setFont(f);
            g.drawString(s[i], 50, (50+(20*i)));
        }

        for(int i=0;i<s2.length;i++)
        {
            Font f = new Font(s2[i], Font.BOLD, 25);
            g.setFont(f);
            g.drawString(s2[i], 50, (300+(20*i)));
        }
    }
}