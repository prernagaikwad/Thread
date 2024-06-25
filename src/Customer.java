public class Customer implements Runnable
{
    BankAccount account;

    public Customer(BankAccount account)
    {
        this.account = account;
    }

    @Override
    public void run()
    {
        for(int i =0 ;i < 5;i++)
        {
            account.deposit(100);
            account.withdraw(50);
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }

    }
}
