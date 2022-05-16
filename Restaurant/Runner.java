public class Runner
{
   String name = "";
   public Runner(String str)
   {
      name = str;
   }
   
   public void startWork()
   {
      System.out.println("My name is "+ name +" and I am now working as the Runner");
   }

   public void stopWork()
   {
      System.out.println("My name is "+ name +" and I am now done working as the Runner");
   }
}