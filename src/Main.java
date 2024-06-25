public class Main
{
    public static void main(String[] args) {

        BankAccount sharedAccount = new BankAccount(20000);

        //Creating customer threads

        Thread customer1= new Thread(new Customer(sharedAccount),"customer 1");
        Thread customer2 = new Thread(new Customer(sharedAccount),"customer 2");
        Thread customer3 = new Thread(new Customer(sharedAccount),"customer 3");


       //Starting cutsomer threads

        customer1.start();
        customer2.start();
        customer3.start();

        try
        {
            customer1.join();
            customer2.join();
            customer3.join();
        }
         catch (InterruptedException e)
         {
             e.printStackTrace();
         }

        System.out.println("Final balance "+ sharedAccount.getBalance());



    }
}
