import java.util.*;
class ExceptionDemoXX
{
    public static void main(String A[])
    {

        Scanner sobj=new Scanner(System.in);


        int no1=0;
        int no2=0;
        int ans=0;

        try{

        System.out.println("Enter First Number:");
        no1=sobj.nextInt();

        System.out.println("Enter Second Number:");
        no2=sobj.nextInt();

        ans=no1/no2; //exception prone code 
        }
        catch(ArithmeticException aobj)
        {
            System.out.println("Exception occured:" +aobj);

        }

        catch(Exception eobj)
        {
            System.out.println("Isode numeric catch");

        }
        finally
        {
            System.out.println("Inside Finally Block");
        }

        System.out.println("division is:"+ans);



    }
}