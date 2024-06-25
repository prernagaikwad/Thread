public class PatientName
{
    public static void main(String[] args)
    {

        Hospital hospital = new Hospital();

        Thread patient1 = new Thread(new Patient("Paitent 1",hospital));
        Thread patient2 = new Thread(new Patient("Patient 2",hospital));
        Thread patient3 = new Thread(new Patient("Patient 3",hospital));

        patient1.start();
        patient2.start();
        patient3.start();

        try
        {
            patient1.join();
            patient2.join();
            patient3.join();

        }
        catch(InterruptedException e)
        {
            System.out.println("Main thread was interrupted "+e.getMessage());
            Thread.currentThread().interrupt();

        }

        System.out.println("All patients have been treated");

    }


}
