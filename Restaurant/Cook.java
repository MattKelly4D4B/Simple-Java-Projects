public class Cook
{
   String name = "";
   public Cook(String str)
   {
      name = str;
   }
   
   public void startWork()
   {
      System.out.println("My name is "+ name +" and I am now working as the Cook");
   }

   public void stopWork()
   {
      System.out.println("My name is "+ name +" and I am now done working as the Cook");
   }
}