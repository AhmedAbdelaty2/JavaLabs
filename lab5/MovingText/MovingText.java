import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.*;
import java.awt.event.KeyEvent;


public class MovingText extends Applet
{
    int x=300, y=350;
    int z=0;

    public void init()
    {
        this.addKeyListener(new MyKeyListener());
    }

    public void paint(Graphics g)
    {
        g.drawString("JAVA", x, y);
    }    

    class MyKeyListener implements KeyListener{

        public void keyPressed (KeyEvent e)
        {
            if(e.getKeyCode()==KeyEvent.VK_UP)
            {
                y--;
            }
            else if(e.getKeyCode()==KeyEvent.VK_DOWN)
            {
                y++;
            }
            else if(e.getKeyCode()==KeyEvent.VK_RIGHT)
            {            
                x++;
            }
            else if(e.getKeyCode()==KeyEvent.VK_LEFT)
            {
                x--;
            }
        
            repaint();
    
        }
        public void keyReleased(KeyEvent e)
        {
            
        }
        public void keyTyped(KeyEvent e){}
    }
}