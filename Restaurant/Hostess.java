public class Hostess
{
   String name = "";
   public Hostess(String str)
   {
      name = str;
   }
   
   public void startWork()
   {
      System.out.println("My name is "+ name +" and I am now working as the Hostess");
   }

   public void stopWork()
   {
      System.out.println("My name is "+ name +" and I am now done working as the Hostess");
   }
}