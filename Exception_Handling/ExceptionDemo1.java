import java.util.*;
class ExceptionDemo1
{
    public static void main(String A[])
    {
      Scanner sobj=new Scanner(System.in);
      int iNo1=0;
      int iNo2=0;
      int iAns=0;

      System.out.println("Enter the First Number:");
      iNo1=sobj.nextInt();

      System.out.println("Enter the Second  Number:");
      iNo2=sobj.nextInt();

      iAns=iNo1/iNo2; //Exception Prone code

      System.out.println("The Divsion of the two number is:"+iAns );
      


    

    }
}