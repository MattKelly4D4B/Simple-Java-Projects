import java.io.IOException;

public class ToolsTestDriver

{
   public static void main(String[] args)
   {   
      try
      {
         if (args.length == 3)
         {
            FileTools.joinFile(args[0], args[1], args[2]);
            
         }//end if
         else if(args.length == 2)
         {
            FileTools.copyFile(args[0], args[1]);
         }
         else
         {
            System.out.println("******************** Usage Message ********************");
            System.out.println("Copy a file   : java ToolsTestDriver inputFile outputFile");
            System.out.println("Join two files: java ToolsTestDriver inputFileA inputFileB outputFile"); 
         }
      } //end try  
      catch(IOException e)
      {
      System.out.println("IO Exception message: " + e.getMessage());
      }
   }//end main
}//end class