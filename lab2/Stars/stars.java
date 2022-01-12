class Stars
{
    public static void main(String[] args)
    {
        for(int i=1;i<7;i++)
        {

            for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }

            for(int j=20;j>i*2;j--)
            {
                System.out.print(" ");
            }

            for(int j=0;j<i;j++)
            {
                System.out.print("* ");
            }

            
            System.out.print("\n");
        }
    }
}