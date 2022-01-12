class Main 
{
    public static void main(String[] args)
    {
        Complex comp1 = new Complex();
        comp1.setReal(1);
        comp1.setImaginary(3);
        comp1.PrintComplex();

        Complex comp2 = new Complex();
        comp2.setReal(2);
        comp2.setImaginary(2);
        comp2.PrintComplex();

        Complex comp3 = new Complex();

        comp3 = comp1.Sum(comp2);
        comp3.PrintComplex();

        comp3 = comp1.Subtract(comp2);
        comp3.PrintComplex();
    }
}

