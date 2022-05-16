import java.util.Scanner;

class Resturant
{
   public static void main(String[] args)
   {
  
      String mgr = "";
      String ck = "";
      String Hs = "";
      String Wa = "";
      String Rn = "";

  
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter the managers name: ");
      mgr = sc.next();     
      Manager TheManager = new Manager(mgr);
      
      System.out.print("Enter the cooks name: ");
      ck = sc.next();     
      Cook TheCook = new Cook(ck);
      
      System.out.print("Enter the Hostess' name: ");
      Hs = sc.next();     
      Hostess TheHostess = new Hostess(Hs);
      
      System.out.print("Enter the Waiter's name: ");
      Wa = sc.next();     
      Waiter TheWaiter = new Waiter(Wa);
      
      System.out.print("Enter the Runners name: ");
      Rn = sc.next();     
      Runner TheRunner = new Runner(Rn);
      
      TheManager.startWork();
      TheManager.stopWork();
      
      TheCook.startWork();
      TheCook.stopWork();
      
      TheHostess.startWork();
      TheHostess.stopWork();
      
      TheWaiter.startWork();
      TheWaiter.stopWork();

      TheRunner.startWork();
      TheRunner.stopWork();
   }
}