import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.*;
import java.awt.Button;
import java.lang.*;

public class PlayandPause extends Applet implements Runnable
{
    Thread th;
    int x = 500;
    int y = 500;
    int len = 100;
    int heig = 100;
    int dir = 0;
    Boolean flag = false;
    Button b1, b2;

    public void init()
    {
        b1 = new Button("Start");
        b1.addActionListener(new StartB());

        b2 = new Button("Pause");
        b2.addActionListener(new PauseB());

        add(b1);
        add(b2);

        th = new Thread(this);
    }

    public void paint(Graphics g)
    {
        g.fillOval(x, y, len, heig);
    }

    class StartB implements ActionListener
    {
        public void actionPerformed(ActionEvent ev)
        {
            if(flag == false)
            {
                th.start();
                flag = true;
            }

            else
                th.resume();
        }

    }

    class PauseB implements ActionListener
    {
        public void actionPerformed(ActionEvent ev)
        {
            th.suspend();
        }

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
                    break;
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