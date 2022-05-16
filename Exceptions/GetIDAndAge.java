import java.util.Scanner;

public class GetIDAndAge
{
   public static void main(String[] args)
   {  
      int id = -1;
      int age = -1;
      Scanner input = new Scanner(System.in);
      String IDError = "Invalid ID entry 0-999 only.";
      String AgeError = "Only ages 1-119 are accepted";
      
      while(age != 0 && id != 0)
      {
         try
         {
         
            System.out.print("Enter your id: ");
            id = input.nextInt();
            
            if (id < 0 || id > 999)
            {
            throw (new DataEntryException(IDError));
            }//end if
            System.out.print("Enter your age:");
            age = input.nextInt();
            
            if (age < 0 || age > 119)
            {
            throw (new DataEntryException(AgeError));
            }//end if
            
         }//end try
          
         catch (DataEntryException e) {
            System.out.println("Please try again.");
         }//end catch
         
         catch (NumberFormatException e) {
            System.out.println("Please enter only numbers.");
         }//end catch
      
      }//end while
   
   }//end main
}//end class