import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class SlotMachine extends JFrame implements ActionListener
{

   // Attributes
   private JLabel dieALabel;
   private JLabel dieANumber;
   private JLabel dieBLabel;
   private JLabel dieBNumber;
   private JLabel dieCLabel;
   private JLabel dieCNumber;
   private JLabel phraseLabel;
   
   private JButton rollButton;
   private JLabel totalLabel;
   private JLabel youWinLabel;
   
   private Font defaultFont;
   
   private Random generator;
   private int total;


   public SlotMachine()
   {
      super("Card Game");
   
      generator = new Random();
   
      createGameWidgets();
      
      setFonts();
   
      buildGameWindow();
      
      initializeGameSettings();
   
      setVisible(true);
   } // End constructor
   
   private void createGameWidgets()
   {
      dieALabel = new JLabel("Apples ");
      dieANumber = new JLabel(" 0 ");
      dieBLabel = new JLabel("Bananas ");
      dieBNumber = new JLabel(" 0 ");
      dieCLabel = new JLabel("Grapes ");
      dieCNumber = new JLabel(" 0 ");
      phraseLabel = new JLabel("[ Have Fun! ]");
      
      rollButton = new JButton("ROLL");
      totalLabel = new JLabel(" 0 ");
      youWinLabel = new JLabel("YOU WON!");

      defaultFont = new Font("Arial", Font.BOLD, 30);
} // End method

private void setFonts()
{
      dieALabel.setFont(defaultFont);
      dieANumber.setFont(defaultFont);
      dieBLabel.setFont(defaultFont);
      dieBNumber.setFont(defaultFont);
      dieCLabel.setFont(defaultFont);
      dieCNumber.setFont(defaultFont);
      phraseLabel.setFont(defaultFont);
      totalLabel.setFont(defaultFont);
      youWinLabel.setFont(defaultFont);

      rollButton.setFont(defaultFont);
   } // End method

   private void buildGameWindow()
   {
      setSize(250, 300);
      setLayout(new FlowLayout(FlowLayout.LEFT));
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      add(dieALabel);
      add(dieANumber);
      add(dieBLabel);
      add(dieBNumber);
      add(dieCLabel);
      add(dieCNumber);
      add(phraseLabel);
      add(rollButton);
      add(totalLabel);

      rollButton.addActionListener(this);
}// End method

private void initializeGameSettings()
{
total = 0;
dieANumber.setText(" 0 ");
dieBNumber.setText(" 0 ");
dieCNumber.setText(" 0 ");
totalLabel.setText(" 0 ");
remove(youWinLabel);

repaint(); // Always to do this last in this method
} // End method

// ---------------------------------------
@Override
   public void actionPerformed(ActionEvent event) // This is the event handler
   {
      int numberAValue = generator.nextInt(9) + 1; // 1..6
      int numberBValue = generator.nextInt(9) + 1;
      int numberCValue = generator.nextInt(9) + 1;

      int rollPoints;
      
      if (total >= 1)
         {
         initializeGameSettings();
         } // End if
      
      dieANumber.setText("" + numberAValue);
      dieBNumber.setText("" + numberBValue);
      dieCNumber.setText("" + numberCValue);
      
      rollPoints = calculatePoints(numberAValue, numberBValue, numberCValue);
      
      total = total + rollPoints;
      
      totalLabel.setText("" + total);   

   } // End method

     
   private int calculatePoints(int valueA, int valueB, int valueC)
   {
   int points;
   
   if (valueA == 7 && valueB == 7 && valueC == 7)
      {
      points = 50;
      phraseLabel.setText("[ Three 7's! ]");
      } // End if
   else if ((valueA == 7 && valueB == 7)||(valueA == 7 && valueC == 7)||(valueB == 7 && valueC == 7))
      {
      points = 25;
      phraseLabel.setText("[ Two 7's! ]");
      } // End else if
   else if (valueA == valueB && valueA == valueC)
   {
      points = 20;
      phraseLabel.setText("[ Three of a Kind! ]");
   }
   else if (valueA == valueB - 1 && valueA == valueC - 2)
   {
      points = 20;
      phraseLabel.setText("[ Three number run! ]");
   }
   else if (valueC == valueB - 1 && valueC == valueA - 2)
   {
      points = 20;
      phraseLabel.setText("[ Three number run! ]");
   }
   else if (valueC == valueB - 1 && valueC == valueA - 2)
   {
      points = 20;
      phraseLabel.setText("[ Three number run! ]");
   }
   else if (valueA == valueB || valueA == valueC || valueB == valueC)
   {
      points = 10;
      phraseLabel.setText("[ Two of a Kind! ]");
   }
   else
      {
      points = -5;
      phraseLabel.setText("[ No Matches ]");
      } // End else
   return points;
   } // End method  
   
}//end class