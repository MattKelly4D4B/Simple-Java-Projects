import java.util.Scanner;

public class ConsonantsOnly
{
   public static void main(String[] args)
   {
      
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a phrase: ");
      
      String phrase = input.nextLine();
      String modifiedPhrase = "";
      modifiedPhrase = phrase.replaceAll("[AEIOUaeiou]","");
      System.out.println(modifiedPhrase);   

      }
        
}