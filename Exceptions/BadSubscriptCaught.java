import java.util.Scanner;

class BadSubscriptCaught
{
   public static void main (String [] args)
   {
   int num;//array Index
   String[] names = {"Matt", "Adam", "Ashley", "Navid", "Tevis", "Jimmy", "John", "Kevin", };//string array of 8 names
   Scanner sc = new Scanner(System.in);//scanner
   
    try{
         System.out.print("Enter a number 1-8 to view a name: "); 
         num = sc.nextInt();
         
         System.out.println("Name is: " + names[num-1]);
       }//end try
      catch(ArrayIndexOutOfBoundsException e)
       {
            System.out.println("You need to enter a number 1-8 only.");
       }//end catch
   
   }//end main
   
}//end class