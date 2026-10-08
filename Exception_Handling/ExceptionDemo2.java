import java.util.*;
class ExceptionDemo2
{
    public static void main(String A[])
    {
      Scanner sobj=new Scanner(System.in);
      int iArr[]={11,21,31,41,51};

      int iIndex=0;

      System.out.println("Enter the index:");
      iIndex=sobj.nextInt();

      System.out.println("Element of array is:"+iArr[iIndex]); //Exception Prone code

      System.out.println("End of main");


    

    }
}