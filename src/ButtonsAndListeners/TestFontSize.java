package ButtonsAndListeners;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestFontSize extends JFrame implements ActionListener {
    //INITIALIZING THE LABEL NAMES AND FONT SIZE
	private JLabel letterLabel;
    private JLabel sizeLabel;
    private JButton increaseButton;
    private JButton decreaseButton;
    private int fontSize = 18;

    public TestFontSize () {
        //INITIALIZING THE LABEL AND THE INCREASING OR DECREASING SIZE
        letterLabel = new JLabel("X");
        letterLabel.setFont(new Font("Serif", Font.PLAIN, fontSize));
        sizeLabel = new JLabel(Integer.toString(fontSize));
        increaseButton = new JButton("Increase");
        increaseButton.addActionListener(this);
        decreaseButton = new JButton("Decrease");
        decreaseButton.addActionListener(this);
        
        //GRID LAYOUT AND THE JFRAME MAKING
        JPanel topPanel = new JPanel(new GridLayout(2, 1));
        topPanel.add(letterLabel);
        topPanel.add(sizeLabel);
        
        JPanel bottomPanel = new JPanel(new GridLayout(1, 2));
        bottomPanel.add(increaseButton);
        bottomPanel.add(decreaseButton);
        
        add(topPanel, BorderLayout.NORTH);
        add(bottomPanel, BorderLayout.SOUTH);
        
        //FRAME CREATION
        setTitle("Font Size Program");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 250);
        setVisible(true);
    }
    //METHOD FOR THE WORKING OF INCREASE OR DECREASE FOR THE FONT 
    public void actionPerformed(ActionEvent e) {
       //FONT SIZE INCREASE
    	if (e.getSource() == increaseButton) {
            fontSize++;
       //FONT SIZE DECREASE
        } else if (e.getSource() == decreaseButton && fontSize > 1) {
            fontSize--;
        }
    	//SETTING THE STRING SIZE FROM ABOVE AND FONT NAME 
        letterLabel.setFont(new Font("Serif", Font.PLAIN, fontSize));
        sizeLabel.setText(Integer.toString(fontSize));
    }
   //WORKING CODE
    public static void main(String[] args) {
        new TestFontSize();
    }
}

