import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.*;

public class DrawLine extends Applet
{
    int x1, x2, y1, y2;

    public void init()
    {
        this.addMouseListener(new MyMouseListener());
        this.addMouseMotionListener(new MyMouseMListener());
    }

    public void paint(Graphics g)
    {
        g.drawLine(x1, y1, x2, y2);
    }
    class MyMouseListener implements MouseListener
    {
        public void mouseClicked(MouseEvent me){}
        public void mouseEntered(MouseEvent me){}
        public void mouseExited(MouseEvent me){}
        public void mouseReleased(MouseEvent me){}
        public void mousePressed(MouseEvent me)
        {
            x1 = me.getX();
            y1 = me.getY();
        }

    }

    class MyMouseMListener implements MouseMotionListener
    {
        public void mouseDragged(MouseEvent me)
        {
            x2 = me.getX();
            y2 = me.getY();
            repaint();
        }
        public void mouseMoved(MouseEvent me){}
    }
}
