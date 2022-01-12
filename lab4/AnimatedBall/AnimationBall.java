import java.applet.Applet;
import java.awt.Graphics;
import java.lang.*;

import javax.lang.model.util.ElementScanner6;

public class AnimationBall extends Applet implements Runnable
{
    Thread th;
    int x = 500;
    int y = 500;
    int len = 100;
    int heig = 100;
    int dir = 2;

    public void init()
    {
        th = new Thread(this);
        th.start();
    }

    public void paint(Graphics g)
    {
        g.fillOval(x, y, len, heig);
    }

    public void run()
    {
        while(true)
        {
            switch(dir)
            {
                case 0:
                {
                    if(x>(getWidth()-len))
                    {
                        dir = 1;
                    }
                    else if(y>(getHeight()-heig))
                    {
                        dir = 2;
                    }
                    else
                    {
                        x++;
                        y++;
                    }

                    break;
                }

                case 1:
                {
                    if(x<0)
                    {
                        dir = 0;
                    }
                    else if(y>(getHeight()-heig))
                    {
                        dir = 3;
                    }
                    else
                    {
                        x--;
                        y++;
                    }
                    break;
                }

                case 2:
                {
                    if(x>(getWidth()-len))
                    {
                        dir = 3;
                    }
                    else if(y<0)
                    {
                        dir = 0;
                    }
                    else
                    {
                        x++;
                        y--;
                    }
                    break;
                }

                case 3:
                {
                    if(x<0)
                    {
                        dir = 2;
                    }
                    else if(y<0)
                    {
                        dir = 1;
                    }
                    else
                    {
                        x--;
                        y--;
                    }
                }
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