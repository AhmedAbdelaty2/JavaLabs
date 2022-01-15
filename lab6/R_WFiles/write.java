import java.io.*;

class write
{
    public static void main (String[] args)
    { 
        FileWriter fileWriter= null;
        PrintWriter printWriter= null;
        try
        {
            //Opening a file in append mode using FileWriter
            fileWriter= new FileWriter("sample.txt", true);
            //Wrapping BufferedWriterobject in PrintWriter
            printWriter= new PrintWriter(fileWriter);
            //Bringing cursor to next line
            printWriter.println();
            //Writing text to file
            for(String data : args)
            {
            printWriter.println(data);
            }
        }
        catch(IOException e){
            e.printStackTrace();
            }
            finally
            {
                try
                {
                    printWriter.close();
                    fileWriter.close();
                }
                catch(IOException e)
                {
                    e.printStackTrace();
                }
            }
    }
}