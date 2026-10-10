class Base
{
    public int iX=0;
    public int iY=0;
    public void Display()
    {
        System.out.println("Inside the Base class");
    }
}
class Derived extends Base
{
    public int iZ;
    public void Display2()
    {
        System.out.println("Inside the Derived class");
    }
}

class SingleLevel
{
    public static void main(String A[])
    {
        Derived dobj1=new Derived();
        dobj1.Display();
        dobj1.Display2();
        
    }
}