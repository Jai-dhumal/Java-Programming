
class Demo extends Thread
{
    public void run()
    {
        try
        {
            int i = 0;

            for (i = 0; i <= 10; i++)
            {
                System.out.println("Thread:" +
                    Thread.currentThread().getName() + " " + i);

                Thread.sleep(3000);
            }
        }
        catch (InterruptedException eobj)
        {
            System.out.println(eobj);
        }
    }
}

class ThreadDemo8
{
    public static void main(String A[])
    {
        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();

        dobj1.setName("First Thread");
        dobj2.setName("Second Thread");

        dobj1.start();
        dobj2.start();
    }
}

