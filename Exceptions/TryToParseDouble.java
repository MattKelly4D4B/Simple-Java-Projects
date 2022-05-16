import java.util.Scanner;

class TryToParseDouble
{
   public static void main (String [] args)
   {
   String input;
   double num = 0;
   Scanner sc = new Scanner(System.in);//scanner
   
    try{
         System.out.print("Enter a number to convert to a double: "); 
         input = sc.next();
         
         num = Double.parseDouble(input); 
        
       }//end try
       
      catch(NumberFormatException e)
       {
            System.out.println("You need to enter a valid number to parse double.");
       }//end catch
      finally
      {
          System.out.println(num);
      }
   
   }//end main
   
}//end class