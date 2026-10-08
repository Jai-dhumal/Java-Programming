import java.util.*;

class ExceptionDemo2 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        int[] iArr = {11, 21, 31, 41, 51};
        int iIndex = 0;

        try {
            System.out.println("Enter the index:");
            iIndex = sobj.nextInt();
            System.out.println("Element of array is: " + iArr[iIndex]); // Exception Prone code
        } 
        catch (ArrayIndexOutOfBoundsException aobj) {
            System.out.println("Exception occurred: " + aobj);
        } 
        finally {
            System.out.println("Inside the Finally Block");
            sobj.close(); // Best practice: always close the scanner when done
        }

        System.out.println("End of main");
    }
}