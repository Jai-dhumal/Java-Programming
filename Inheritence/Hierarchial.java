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

class DerivedX extends Base
{
    public int iK,iM;
    public void Display3()
    {
        System.out.println("Inside the DerivedX");
    }
}

class Hierarchial
{
    public static void main(String A[])
    {
        DerivedX dobj1=new DerivedX();
        Derived aobj1=new Derived();
        dobj1.Display();
        dobj1.Display3();

        aobj1.Display();
        aobj1.Display2();
        
    }
}