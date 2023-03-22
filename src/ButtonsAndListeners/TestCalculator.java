package ButtonsAndListeners;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TestCalculator extends JFrame implements ActionListener {
    
    // CALCULATORS MAIN VARIABLES
    double accumulator = 0.0;
    char operator;
    
    // CALCULATORS MAIN COMPONENTS
    JLabel displayLabel;                         //THE DISPLAY LABEL
    JTextField inputField;                       //INPUT FIELD FOR THE NUMBER INPUT
    JButton clearButton;
    JButton addButton;
    JButton subtractButton; 
    JButton multiplyButton; 
    JButton divideButton;
    
    public TestCalculator() {
        
        // CREATION OF BUTTONS BY ASSIGNING OF THEIR SYMBOL AND THEIR TEXT FIELD WITH SIZES
        displayLabel = new JLabel(Double.toString(accumulator));
        //THE Double.ToString HELPS US TO SEE THE NUMBERS IN DECIMAL FORMAT
        inputField = new JTextField(10);
        clearButton = new JButton("Clear");
        addButton = new JButton("+");
        subtractButton = new JButton("-");
        multiplyButton = new JButton("*");
        divideButton = new JButton("/");
        
        // SETTING THE LAYOUTS FOR THE BUTTONS
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 1));
        
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout());
        topPanel.add(displayLabel);
        
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new GridLayout(2, 1));
        
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout());
        inputPanel.add(inputField);
        
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 5));
        buttonPanel.add(clearButton);
        buttonPanel.add(addButton);
        buttonPanel.add(subtractButton);
        buttonPanel.add(multiplyButton);
        buttonPanel.add(divideButton);
        
        bottomPanel.add(inputPanel);
        bottomPanel.add(buttonPanel);
        
        panel.add(topPanel);
        panel.add(bottomPanel);
        
        //ADDITON OF THE JPANEL TO JFRAME
        this.add(panel);
        
        //CREATION OF JFRAME
        this.pack();
        this.setTitle("Calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
        // ADDITION OF ACTION LISTENERS FOR THE BUTTONS
        clearButton.addActionListener(this);
        addButton.addActionListener(this);
        subtractButton.addActionListener(this);
        multiplyButton.addActionListener(this);
        divideButton.addActionListener(this);
    }
    
    // THE METHOD OF WORKING OF CALCULATOR
    //IF (E.GETSOURCE()==<FUNCTION>){
    //ACCUMULATOR <FUNCTIONSYMBOL> DOUBLE.PARSEDOUBLE(INPUTFIELD.GETTEXT());
    //DISPLAYLABEL.SETTEXT(DOUBLE.TOSTRING(ACCUMULATOR));
    //DISPLAYLABEL.SETTEXT(DOUBLE.TOSTRING(ACCUMULATOR));
    //}
    
    public void actionPerformed(ActionEvent e) {
        //FOR CLEAR FUNCTION
    	if (e.getSource() == clearButton) {
            accumulator = 0.0;
            inputField.setText("");
            displayLabel.setText(Double.toString(accumulator));
        }
    	//FOR ADDITION FUNCTION
        else if (e.getSource() == addButton) {
            accumulator += Double.parseDouble(inputField.getText());
            inputField.setText("");
            displayLabel.setText(Double.toString(accumulator));
            operator = '+';
        }
    	//FOR SUBTRACTION FUNCTION
        else if (e.getSource() == subtractButton) {
            accumulator -= Double.parseDouble(inputField.getText());
            inputField.setText("");
            displayLabel.setText(Double.toString(accumulator));
            operator = '-';
        }
    	//FOR MULTIPLICATION FUNCTION
        else if (e.getSource() == multiplyButton) {
            accumulator *= Double.parseDouble(inputField.getText());
            inputField.setText("");
            displayLabel.setText(Double.toString(accumulator));
            operator = '*';
        }
    	//FOR DIVISION FUNCTION
        else if (e.getSource() == divideButton) {
            accumulator /= Double.parseDouble(inputField.getText());
            inputField.setText("");
            displayLabel.setText(Double.toString(accumulator));
            operator = '/';
        }
        
    }
    //DISPLAYING OF THE CALCULATOR
    public static void main(String[] args) {
        new TestCalculator();
    }
}