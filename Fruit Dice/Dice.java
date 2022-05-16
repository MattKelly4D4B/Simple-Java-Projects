import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

class Dice extends JFrame implements ActionListener
{
// Constants
private final int WINNING_POINTS = 50;

// Attributes
private JLabel dieALabel;
private JLabel dieANumber;
private JLabel dieBLabel;
private JLabel dieBNumber;
private JLabel phraseLabel;

private JButton rollButton;
private JLabel totalLabel;
private JLabel youWinLabel;

private Font defaultFont;

private Random generator;
private int total;

//---------------------------------
public Dice()
{
super("Dice Game");

generator = new Random();

createGameWidgets();

setFonts();

buildGameWindow();

initializeGameSettings();



setVisible(true);
} // End constructor


// -----------------------------------
private void createGameWidgets()
{
dieALabel = new JLabel("Die-A ");
dieANumber = new JLabel(" 0 ");
dieBLabel = new JLabel("Die-B ");
dieBNumber = new JLabel(" 0 ");
phraseLabel = new JLabel("[ Have Fun! ]");

rollButton = new JButton("ROLL");
totalLabel = new JLabel(" 0 ");
youWinLabel = new JLabel("YOU WIN!");

defaultFont = new Font("Arial", Font.BOLD, 30);
} // End method

// ------------------------------
private void setFonts()
{
dieALabel.setFont(defaultFont);
dieANumber.setFont(defaultFont);
dieBLabel.setFont(defaultFont);
dieBNumber.setFont(defaultFont);
phraseLabel.setFont(defaultFont);
totalLabel.setFont(defaultFont);
youWinLabel.setFont(defaultFont);

rollButton.setFont(defaultFont);
} // End method

// ------------------------------
private void buildGameWindow()
{
setSize(250, 300);
setLayout(new FlowLayout(FlowLayout.LEFT));
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

add(dieALabel);
add(dieANumber);
add(dieBLabel);
add(dieBNumber);
add(phraseLabel);
add(rollButton);
add(totalLabel);

rollButton.addActionListener(this);
} // End method

// ------------------------------
private void initializeGameSettings()
{
total = 0;
dieANumber.setText(" 0 ");
dieBNumber.setText(" 0 ");
totalLabel.setText(" 0 ");
remove(youWinLabel);

repaint(); // Always to do this last in this method
} // End method

// ---------------------------------------
@Override
public void actionPerformed(ActionEvent event) // This is the event handler
{
int numberAValue = generator.nextInt(6) + 1; // 1..6
int numberBValue = generator.nextInt(6) + 1;
int rollPoints;

if (total >= WINNING_POINTS)
   {
   initializeGameSettings();
   } // End if

dieANumber.setText("" + numberAValue);
dieBNumber.setText("" + numberBValue);

rollPoints = calculatePoints(numberAValue, numberBValue);

total = total + rollPoints;

totalLabel.setText("" + total);   

if (total >= WINNING_POINTS)
   {
   add(youWinLabel);
   repaint();
   } // End if

} // End method

// ------------------------------------
private int calculatePoints(int valueA, int valueB)
{
int points;

if (valueA == valueB)
   {
   points = valueA * 2;
   phraseLabel.setText("[ Doubles! ]");
   } // End if
else if (valueA > valueB)
   {
   points = valueA;
   phraseLabel.setText("[ A wins! ]");
   } // End else if
else
   {
   points = valueB;
   phraseLabel.setText("[ B wins! ]");
   } // End else
return points;
} // End method



} // End class
