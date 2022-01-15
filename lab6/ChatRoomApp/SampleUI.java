import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.*;
import  java.io.*;
import java.net.*;

public class SampleUI extends JFrame implements Runnable
{
    Socket mySocket;
    DataInputStream dis;
    PrintStream ps;
    String msg;
    JTextArea ta = new JTextArea(20,50);
    JScrollPane scroll= new JScrollPane(ta);
    JTextField tf= new JTextField(40);
    JButton okButton= new JButton("Send");
    Thread th;

    public SampleUI()
    {
        this.setLayout(new FlowLayout());
        try
        {
            mySocket= new Socket(InetAddress.getLocalHost(), 5005);
            dis = new DataInputStream(mySocket.getInputStream());
            ps= new PrintStream(mySocket.getOutputStream());
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }

        okButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                //ta.append(tf.getText()+"\n");
                msg = tf.getText();
                ps.println(msg);
                tf.setText("");
            }
        });

        add(scroll);
        add(tf);
        add(okButton);

        th = new Thread(this);
        th.start();
    }

    public static void main(String args[])
    {
        SampleUI ui=new SampleUI();
        ui.setSize(600, 400);
        ui.setResizable(false);
        ui.setVisible(true);
    }

    public void run()
    {
        while(true)
        {
            try
            {
                String replyMsg= dis.readLine();
                ta.append(replyMsg + "\n");
            }
            catch(Exception ex)
            {
                ex.printStackTrace();
            }
        }
    }
}