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
        btnCalculate.addActionListener(this);
        edtOne = new JTextField("Enter n1");
        edtTwo = new JTextField("Enter n2");
        textDisplay = new JLabel();        

        add(textDisplay);
        add(edtOne);
        add(edtTwo);
        add(btnCalculate);

	  setTitle("ProgramSixteen");
        setSize(250, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4,0));
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        try{
            num1 =  Integer.valueOf(edtOne.getText());
            num2 = Integer.valueOf(edtTwo.getText());
            res = num1 / num2;
            textDisplay.setText(res + "");
        }catch(NumberFormatException e){
			JOptionPane.showMessageDialog(this, e);
        }catch(ArithmeticException e){
			JOptionPane.showMessageDialog(this, e);
        }
    }
    
    public static void main(String[] args) {
        ProgramSixteen pS = new ProgramSixteen();
    }
}