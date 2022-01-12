//import java.nio.channels.GatheringByteChannel;

class Complex
{
    int real;
    int img;

    public Complex()
    {
        real = 0;
        img = 0;
    }
    public int getReal(){return real;}
    public int getImaginary(){return img;}
    public void setReal(int r){real = r;}
    public void setImaginary(int i){img = i;}
    public Complex Sum(Complex c)
    {
        Complex temp = new Complex();
        temp.real = real + c.real;
        temp.img = img + c.img;

        return temp;
    }

    public Complex Subtract(Complex c)
    {
        Complex temp = new Complex();
        temp.real = real - c.real;
        temp.img = img - c.img;

        return temp;
    }

    public void PrintComplex()
    {
        System.out.println(real+" + "+img+"i");
    }

}
