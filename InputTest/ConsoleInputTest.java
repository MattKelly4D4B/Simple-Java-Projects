import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
  This program tests input from a console window
*/
public class ConsoleInputTest
{
  public static void main(String[] args) throws IOException
  {
    Purse myPurse = new Purse();


    BufferedReader console = new BufferedReader(
      new InputStreamReader(System.in));
      System.out.println("How many nickels do you have");
      String input= console.readLine();
      int count = Integer.parseInt(input);
      myPurse.addNickels(count);

      System.out.println("How many dimes do you have?");
      input = console.readLine();
      count = Integer.parseInt(input);
      myPurse.addDimes(count);

      System.out.println("How many quarters do you have?");
      input = console.readLine();
      count = Integer.parseInt(input);
      myPurse.addQuarters(count);

      double totalValue = myPurse.getTotal();
      System.out.println("The total is $" + totalValue);

      System.exit(0);

  }

}
