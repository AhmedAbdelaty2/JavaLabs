import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.*;
import java.awt.Button;

public class ButtonCount extends Applet
{
    int x=0;
    Button b1, b2;

    public void init()
    {
        b1 = new Button("increase");
        b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ev)
                {
                x++ ;
                repaint() ;
                }
        });

        b2 = new Button("decrease");
        b2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ev)
                {
                x-- ;
                repaint() ;
                }
        
        });

        add(b1);
        add(b2);
    }

    public void paint(Graphics g)
    {
        g.drawString("Count is: "+x, 300, 350);
    }
}