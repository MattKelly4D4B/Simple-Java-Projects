public class Manager
{
   String name = "";
   public Manager(String str)
   {
      name = str;
   }
   
   public void startWork()
   {
      System.out.println("My name is "+ name +" and I am now working as the Manager");
   }

   public void stopWork()
   {
      System.out.println("My name is "+ name +" and I am now done working as the Manager");
   }
}