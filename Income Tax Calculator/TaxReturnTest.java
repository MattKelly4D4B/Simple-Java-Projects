import javax.swing.JOptionPane;

/**
  A class to test the TaxReturn class
*/

public class TaxReturnTest
{
  public static void main(String[] args)
  {
    String input = JOptionPane.showInputDialog("Please enter your income: ");
    double income = Double.parseDouble(input);

    input = JOptionPane.showInputDialog("Please enter S (single) or M (married");
    int status = 0;

    if (input.equalsIgnoreCase("S"))
      status = TaxReturn.SINGLE;
    else if( input.equalsIgnoreCase("M"))
      status = TaxReturn.MARRIED;
    else
    {
      System.out.println("Bad input.");
      System.exit(0);
    }

      TaxReturn aTaxReturn = new TaxReturn(income, status);

      System.out.println("The tax is " + aTaxReturn.getTax());

      System.exit(0);
  }
}
