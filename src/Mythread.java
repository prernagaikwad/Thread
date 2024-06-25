
//Implemented thread by extending thread class
public class Mythread extends Thread {

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "is running");

            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

    public static void main(String[] args)
    {
        Mythread thread1 = new Mythread();
        Mythread thread2 = new Mythread();

        thread1.start();
        thread2.start();



    }

}