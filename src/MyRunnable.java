
 class MyRunnable implements Runnable
{

    @Override
    public void run()
    {
        for(int i =0 ;i <5;i++)
        {
            System.out.println(Thread.currentThread().getName()+"is running:"+i);
        }
        try
        {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args)
    {
        Thread thread1 = new Thread(new MyRunnable(),"Thread 1");
        Thread thread2 = new Thread(new MyRunnable(),"Thread 2");

        thread1.start();
        thread2.start();
    }
}
