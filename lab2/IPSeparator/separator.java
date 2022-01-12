import java.util.StringTokenizer;
import java.util.regex.Pattern;

class StrSeparator
{
    public static void main(String[] args)
    {
        if(Pattern.matches("^(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])(\\.(?!$)|$)){4}$",args[0]))
        {
            String s = args[0];
            int i;
            String s1;

            System.out.println("indexof method");
            for(int j=0;j<3;j++)
            {
                i = s.indexOf('.');
                s1 = s.substring(0, i);
                System.out.println(s1);
                s = s.substring(i+1);   
            }
            System.out.println(s);

            System.out.println("\nStringTokenizer method method");
            String s2 = args[0];
            s2 = s2.replaceAll("\\.", " ");
            StringTokenizer st = new StringTokenizer(s2);
            while (st.hasMoreTokens()) 
            {
                System.out.println(st.nextToken());
            }

            System.out.println("\nsplit method");
            String s3 = args[0];
            String[] s4 = s3.split("\\.", 5);
            for(String element : s4)
            {
                System.out.println(element);
            }
        }
        else
        {
            System.out.println("Please, enter a valid ip");
        }
    }
}