public class Patient implements Runnable
{
  private String name;
  private Hospital hospital;

  public Patient(String name,Hospital hospital)
    {
      this.name = name;
      this.hospital = hospital;
    }

    public void run()
    {

        try
        {
            hospital.checkup(name);
            hospital.checkup(name);

        }
        catch(Exception e)
        {
            System.out.println("Exception in "+ name + "procedures: ");
        }
        finally
        {
            System.out.println(name + " has finished all procedures");
        }


    }

}
