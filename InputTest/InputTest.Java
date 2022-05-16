import javax.swing.JOptionPane;

/**
This program tests input from an input dialogue
*/
public class InputTest
{

public static void main(String[] args)
{
  Purse myPurse = new Purse();

  String input = JOptionPane.showInputDialog("How many nickels do you have?");
  int count = Integer.parseInt(input);
  myPurse.addNickels(count);

  input = JOptionPane.showInputDialog("How many dimes do you have?");
   count = Integer.parseInt(input);
  myPurse.addDimes(count);

  input = JOptionPane.showInputDialog("How many quarters do you have?");
  count = Integer.parseInt(input);
  myPurse.addQuarters(count);

  double totalValue = myPurse.getTotal();
  System.out.println("The total is $" + totalValue);

  System.exit(0);
}
}
