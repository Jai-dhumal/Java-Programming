class Demo extends Thread
{
    public void run()
    {
        int i=0;
        for(i=0;i<=10;i++){
            System.out.println("Thread:"+ Thread.currentThread().getName()+" "+i);
        }
    }
}


class ThreadDemo7
{
    public static void main(String A[])
    {
        Demo dobj1=new Demo();
        Demo dobj2=new Demo();

        dobj1.setName("First Thread");
        dobj2.setName("Second Thread");

        dobj1.start();
        dobj2.start();
        
    }
}