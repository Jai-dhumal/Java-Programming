class ThreadDemo1
{
    public static void main(String A[])
    {
        System.out.println("Inside the main");
        Thread t=Thread.currentThread();
        System.out.println("The name of the thread is:"+t.getName());
        System.out.println("The ID of the thread is:"+t.getId());
        System.out.println("The Tread is alive :"+t.isAlive());
        System.out.println("The Priority of the thread is:"+t.getPriority());

    }
}