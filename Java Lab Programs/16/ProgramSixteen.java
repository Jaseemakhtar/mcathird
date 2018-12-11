/**
*
* author jaseem
* 
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ProgramSixteen extends JFrame implements ActionListener{
	private JButton btnCalculate;
	private JTextField edtOne, edtTwo;
	private JLabel textDisplay;
        
        private int num1;
        private int num2;
        private int res;

    public ProgramSixteen(){
        btnCalculate = new JButton("Divide");
        edtOne = new JTextField();
        edtTwo = new JTextField();
        textDisplay = new JLabel();
            
        setTitle("ProgramSixteen");
        setSize(250, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4,0));
        
        btnCalculate.addActionListener(this);

        add(textDisplay);
        add(edtOne);
        add(edtTwo);
        add(btnCalculate);

	edtOne.setText("Enter n1");
	edtTwo.setText("Enter n2");

        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        String value = edtOne.getText();
        value = value.trim();
        if(value.equals("")){
            return;
        }
        
        value = edtTwo.getText();
        value = value.trim();
        
        if(value.equals("")){
            return;
        }
        
        
        
        try{
            num1 =  Integer.valueOf(edtOne.getText());
            num2 = Integer.valueOf(edtTwo.getText());
            res = num1 / num2;
            textDisplay.setText(res + "");
        }catch(NumberFormatException e){
            textDisplay.setText(e.getMessage());
        }catch(ArithmeticException e){
            textDisplay.setText(e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        ProgramSixteen pS = new ProgramSixteen();
    }
}

