/**
Program to ask for 3 integers then sorts in ascending order.
*/
import java.util.Scanner;
import java.lang.Math;

public class FieldTrip
{


  public static void main(String[] args)
  {

    
    int Children = 0;
    int PerBus = 0;
    int NumBus = 0;
    int ExtraKids = 0;
    
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Enter the number of children on the trip: ");
    Children = scan.nextInt();
    
    System.out.print("Enter the number of children per bus: ");
    PerBus = scan.nextInt();
    
    NumBus = (int) (Children / PerBus);
    ExtraKids = Children % NumBus;
    if (ExtraKids != 0)
    {
      NumBus++;
    }//end if
    
    System.out.println("Number of buses needed: " + NumBus);
    System.out.println("Number of children on last bus: " + ExtraKids);
    
    
    
}
}
