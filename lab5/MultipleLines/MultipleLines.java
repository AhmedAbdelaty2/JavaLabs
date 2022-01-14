import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.*;

public class MultipleLines extends Applet
{
    int[] x1 = new int[100];
    int[] x2 = new int[100];
    int[] y1 = new int[100];
    int[] y2 = new int[100];
    int i=-1;

    public void init()
    {
        this.addMouseListener(new MyMouseListener());
        this.addMouseMotionListener(new MyMouseMListener());
    }

    public void paint(Graphics g)
    {
        for(int j=0;j<=i;j++)
        {
            g.drawLine(x1[j], y1[j], x2[j], y2[j]);
        }
    }
    class MyMouseListener implements MouseListener
    {
        public void mouseClicked(MouseEvent me){}
        public void mouseEntered(MouseEvent me){}
        public void mouseExited(MouseEvent me){}
        public void mouseReleased(MouseEvent me){}
        public void mousePressed(MouseEvent me)
        {
            i++;
            x1[i] = me.getX();
            y1[i] = me.getY();
            
        }

    }

    class MyMouseMListener implements MouseMotionListener
    {
        public void mouseDragged(MouseEvent me)
        {
            x2[i] = me.getX();
            y2[i] = me.getY();
            repaint();
        }
        public void mouseMoved(MouseEvent me){}
    }
}
