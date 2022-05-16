public class Waiter
{
   String name = "";
   public Waiter(String str)
   {
      name = str;
   }
   
   public void startWork()
   {
      System.out.println("My name is "+ name +" and I am now working as the Waiter");
   }

   public void stopWork()
   {
      System.out.println("My name is "+ name +" and I am now done working as the Waiter");
   }
}