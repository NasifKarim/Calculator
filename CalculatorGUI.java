import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI { // Calculator class that creates the GUI
    // Class variables to store calculation values
    private double total1 = 0.0;
    private  double total2 = 0.0;
    private char math_Operator; // variable to store math operator

    private JPanel Calculator; // main panel
    private JTextField textDisplay; // display text field
    private JButton buttonEq; // equals button
    // buttons for all the numbers
    private JButton buttonOne;
    private JButton buttonTwo;
    private JButton buttonThree;
    private JButton buttonFour;
    private JButton buttonFive;
    private JButton buttonSix;
    private JButton buttonSeven;
    private JButton buttonEight;
    private JButton buttonNine;
    private JButton buttonZero;
    private JButton buttonDot;
    private JButton buttonAdd; // displays the add button
    private JButton buttonClear; // clears the text field
    private JButton buttonMinus; // displays the minus button
    private JButton buttonMult; // displays multiplication button
    private JButton buttonDiv;// displays the division button


    // Method to handle operator buttons
    private void getOperator (String buttonText){
        math_Operator = buttonText.charAt(0); // store the operator character
        total1 = total1 + Double.parseDouble(textDisplay.getText()); // convert the display text to double and add
        textDisplay.setText("");
    }
     // constructor to initialize components
    public CalculatorGUI() {
        buttonOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonOneText = textDisplay.getText() + buttonOne.getText();
                textDisplay.setText(buttonOneText);
            }
        });
        buttonTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnTwoText = textDisplay.getText() + buttonTwo.getText();
                textDisplay.setText(btnTwoText);

            }
        });
        buttonThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnThreeText = textDisplay.getText() + buttonThree.getText();
                textDisplay.setText(btnThreeText);

            }
        });
        buttonFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFourText = textDisplay.getText() + buttonFour.getText();
                textDisplay.setText(btnFourText);

            }
        });
        buttonFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFiveText = textDisplay.getText() + buttonFive.getText();
                textDisplay.setText(btnFiveText);

            }
        });
        buttonSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSixText = textDisplay.getText() + buttonSix.getText();
                textDisplay.setText(btnSixText);

            }
        });
        buttonSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSevenText = textDisplay.getText() + buttonSeven.getText();
                textDisplay.setText(btnSevenText);

            }
        });
        buttonEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnEightText = textDisplay.getText() + buttonEight.getText();
                textDisplay.setText(btnEightText);

            }
        });
        buttonNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnNineText = textDisplay.getText() + buttonNine.getText();
                textDisplay.setText(btnNineText);

            }
        });
        buttonZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnZeroText = textDisplay.getText() + buttonZero.getText();
                textDisplay.setText(btnZeroText);

            }
        });
        // Add button action listener
        buttonAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = buttonAdd.getText();
                getOperator(button_text);
            }
        });
        // Equals button action listener
        buttonEq.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (math_Operator) {
                    case '+' :
                        total2 = total1 + Double.parseDouble(textDisplay.getText());
                        break;
                    case '-' :
                        total2 = total1 - Double.parseDouble(textDisplay.getText());
                        break;
                    case '/':
                        total2 = total1 / Double.parseDouble(textDisplay.getText());
                        break;
                    case '*' :
                        total2 = total1 * Double.parseDouble(textDisplay.getText());
                        break;

                }
                textDisplay.setText(Double.toString(total2));
                total1 = 0;
            }
        });
        // clears the display field
        buttonClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2 = 0;
                textDisplay.setText("");
            }
        });
        // the function of "."
        buttonDot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textDisplay.getText().equals ("")) {
                    textDisplay.setText("0.");
                }

                else if (textDisplay.getText().contains (".") ) {
                    buttonZero.setEnabled(false);
                }
                else {
                    String buttonDotText = textDisplay.getText() + buttonDot.getText();
                    textDisplay.setText(buttonDotText);
                }
                buttonDot.setEnabled(true);
            }
        });
        // Minus button action listener
        buttonMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = buttonMinus.getText();
                getOperator(button_text);
            }
        });
        // Division button action listener
        buttonDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = buttonDiv.getText();
                getOperator(button_text);
            }
        });
        // Multiplication button action listener
        buttonMult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = buttonMult.getText();
                getOperator(button_text);
            }
        });
    }

        // initialize the frame
        // main method
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new CalculatorGUI().Calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


}
