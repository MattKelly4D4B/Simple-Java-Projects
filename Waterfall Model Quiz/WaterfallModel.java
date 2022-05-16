import java.util.Scanner;  // Import the Scanner class

public class WaterfallModel
{   

  public static void main(String[] args)
 { 
  /*Initializes question variables and displays questions using order stored in intArray */
  String stringArray[] = new String[]{"Requirements and Analysis",
                                       "System Design",
                                       "Program Design",
                                       "Coding",
                                       "Unit & Integration Testing",
                                       "System Testing",
                                       "Acceptance Testing",
                                       "Operation & Maintenance"};

    
   int randomInt = (int)(10.0 * Math.random()); //generate random int.
   int intArray[] = {0,0,0,0,0,0,0,0};
   String Correct = "";
   int numTries = 0;
   
   while (numTries <= 3)
   {
   
   if(randomInt == 1 || randomInt == 6)//If statement to determine question order.
   {
      intArray = new int[]{8,7,6,5,4,3,2,1};
   }
   
   else if(randomInt == 2 || randomInt == 7)
   {
      intArray = new int[]{7,6,5,8,4,1,2,3};
   }
   
   else if(randomInt == 3 || randomInt == 8)
   {
      intArray = new int[]{8,6,4,7,1,5,2,3};
   }
   
   else if(randomInt == 4 || randomInt == 9)
   {
      intArray = new int[]{1,3,4,6,7,8,5,2};
   }
   
   else if(randomInt == 5 || randomInt == 10)
   {
      intArray = new int[]{2,4,6,8,3,5,7,1};
   }
   else
   {
   intArray = new int[]{1,2,3,4,5,6,7,8};
   }
  int i = 0;
   
  while(i < 8)
  {
  System.out.println(i + 1 + ") " + stringArray[intArray[i]-1]);
  i++;
  }

/* This section asks user for input and uses it to detetrmine if the user answered correctly */
   Scanner myObj = new Scanner(System.in);
   System.out.println("");
   System.out.println("Put the preceding terms in the correct order based on the Waterfall Model.");
   System.out.println("Use numbers followed by a return for each one, or your answers will be marked wrong.");
   
   int AnswerArray[] = {0,0,0,0,0,0,0,0};
   
   AnswerArray[0] = myObj.nextInt();  // Read user input and store in AnswerArray
   AnswerArray[1] = myObj.nextInt();
   AnswerArray[2] = myObj.nextInt();
   AnswerArray[3] = myObj.nextInt();
   AnswerArray[4] = myObj.nextInt();
   AnswerArray[5] = myObj.nextInt();
   AnswerArray[6] = myObj.nextInt();
   AnswerArray[7] = myObj.nextInt();
   
   for(i=0; i<7; i++)
   {
      if (AnswerArray[i] != intArray[i])
      {
      System.out.println("Incorrect. Try Again.");
      numTries++;
      break;
      }
                 
   } 
   
   if (i == 7)
   {
   System.out.println("Correct");
   break;
   }//end if
   }//End While
   
   if(numTries == 4)
   {
   System.out.println("Sorry. The Correct order is: ");
   int i = 0;
   for (i=0; i<7; i++)
   {
   System.out.print(intArray[i] + ", ");
   }
   System.out.println(intArray[7]);
   
   }
  }//end main
}