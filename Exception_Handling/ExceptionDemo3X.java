import java.util.*;

class Demo
{
    public static int Divsion(int iX1,int iX2) throws ArithmeticException
    {
        int iDiv=0;

        iDiv=iX1/iX2;

        return iDiv;

    }

}
class ExceptionDemo3X
{
    public static void main(String A[])
    {
      Scanner sobj=new Scanner(System.in);
      Demo dobj=new Demo();
      int iNo1=0;
      int iNo2=0;
      int iAns=0;

      System.out.println("Enter the First Number:");
      iNo1=sobj.nextInt();

      System.out.println("Enter the Second  Number:");
      iNo2=sobj.nextInt();

      iAns=dobj.Divsion(iNo1,iNo2); //Exception Prone code

      System.out.println("The Divsion of the two number is:"+iAns );
      


    

    }
}