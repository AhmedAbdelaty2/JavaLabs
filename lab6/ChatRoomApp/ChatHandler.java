import  java.io.*;
import java.net.*;
import java.util.Vector;

class ChatHandler extends Thread
{
    DataInputStream dis;
    PrintStream ps;
    static Vector<ChatHandler> clientsVector = new Vector<ChatHandler>();

    public ChatHandler(Socket cs)
    {
        try
        {
            dis = new DataInputStream(cs.getInputStream());
            ps= new PrintStream(cs.getOutputStream());
            clientsVector.add(this);
            ps.println("Data Received");
            start();
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }
    }

    public void run()
    {
        while(true)
        {
            try
            {
                String str= dis.readLine();
                sendMessageToAll(str);
            }
            catch(IOException ex)
            {
                ex.printStackTrace();
            }
        }
    }
    void sendMessageToAll(String msg)
    {
        for(ChatHandler ch: clientsVector)
        {
        ch.ps.println(msg);
        }
    }
}