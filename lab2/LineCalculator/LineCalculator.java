class LineCalc
{
    public static void main(String[] args)
    {
        if(args[1].equals("+"))
        {
            Float x = Float.parseFloat(args[0]);
            Float y = Float.parseFloat(args[2]);
            Float z = x + y;
            System.out.println(z);
        }
        else if(args[1].equals("-"))
        {
            Float x = Float.parseFloat(args[0]);
            Float y = Float.parseFloat(args[2]);
            Float z = x - y;
            System.out.println(z);
        }
        else if(args[1].equals("*"))
        {
            Float x = Float.parseFloat(args[0]);
            Float y = Float.parseFloat(args[2]);
            Float z = x * y;
            System.out.println(z);
        }
        else if(args[1].equals("/"))
        {
            Float x = Float.parseFloat(args[0]);
            Float y = Float.parseFloat(args[2]);
            Float z = x / y;
            System.out.println(z);
        }
    }
    
}