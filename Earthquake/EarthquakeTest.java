import javax.swing.JOptionPane;

/** 
  A class to test the Earthquake class.
*/

public class EarthquakeTest
    {
      public static void main(String[] args)
      {
              String input = JOptionPane.showInputDialog(
                "Enter a magnitude on the Richter scale:");
              double magnitude = Double.parseDouble(input);
              Earthquake quake = new Earthquake(magnitude);
              System.out.println(quake.getDescription());
              System.exit(0);
      }
    }
