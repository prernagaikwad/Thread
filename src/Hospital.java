
//Implementation of multithreading with exception handling

public class Hospital
{
    public synchronized void checkup(String patientName)
    {
       try
       {
           System.out.println(patientName + "is undergoing checkup");
           Thread.sleep(1000);
           System.out.println(patientName + "has completed the checkup");
       }
       catch(InterruptedException e)
       {
           System.out.println(patientName + "checkup was interrupted:");
           Thread.currentThread().interrupt();
       }
    }

    public synchronized void surgery(String patientName)
    {
       try
       {
           System.out.println(patientName + "is undergoing surgery");
           Thread.sleep(2000);
           System.out.println(patientName + "has completed the surgery" );
       }
        catch(InterruptedException e)
        {
            System.out.println(patientName + "surgery was interrupted:");
            Thread.currentThread().interrupt();
        }
        catch(RuntimeException e)
        {
            System.out.println(e.getMessage());
        }


    }

}
