class Demo extends Thread
{   
    public void run(){


       System.out.println("The Thread is running");

    }
}

class ThreadDemo2
{
    public static void main(String A[])
    {   System.out.println("Insdie the main");  



        Demo dobj1=new Demo();
        Demo dobj2=new Demo();

        dobj1.start();
        dobj2.start();
    }
}