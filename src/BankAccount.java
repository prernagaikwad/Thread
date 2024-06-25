public class BankAccount
{
   double balance;

   public  BankAccount(double intialBalance)
   {
       this.balance = intialBalance;
   }

   //Synchronized method to deposit money
    public synchronized void deposit(double amount)
    {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " deposited :");

    }

    public synchronized void withdraw(double amount)
    {
        if(balance >= amount)
        {
            balance -= amount;
            System.out.println(Thread.currentThread().getName()+ " withdraw "+ amount +" New Balance : "+ balance);
        }
        else
        {
            System.out.println(Thread.currentThread().getName()+ "tried to withdraw" + amount +", but insufficient balance. current balance "+ balance);
        }
    }

    public double getBalance()
    {
        return balance;
    }

}
