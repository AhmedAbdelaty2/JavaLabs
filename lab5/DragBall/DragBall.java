import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.*;

public class DragBall extends Applet
{
    int x = 400;
    int y = 400;
    int len = 100;
    int hei = 100;

    public void init()
    {
        this.addMouseListener(new MyMouseListener());
        this.addMouseMotionListener(new MyMouseMListener());
    }

    public void paint(Graphics g)
    {
        g.fillOval(x, y, len, hei);
    }

    class MyMouseListener implements MouseListener
    {
        public void mouseClicked(MouseEvent me)
        {
            x = me.getX()-(len/2);
            y = me.getY()-(hei/2);
            repaint();
        }
        
        public void mouseEntered(MouseEvent me){}
        public void mouseExited(MouseEvent me){}
        public void mouseReleased(MouseEvent me){}
        public void mousePressed(MouseEvent me){}

    }

    class MyMouseMListener implements MouseMotionListener
    {
        public void mouseDragged(MouseEvent me)
        {
            x = me.getX()-(len/2);
            y = me.getY()-(hei/2);
            repaint();
        }
        public void mouseMoved(MouseEvent me){}
    }

}