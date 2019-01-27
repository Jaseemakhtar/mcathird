import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author jaseem
 */

public class BasicCalculator extends JFrame implements ActionListener{ 
    private char symbol;
    private int num1 = -1;
    private int num2 = -1;
    
    private JTextField textField;
    private JButton btnOne;
    private JButton btnTwo;
    private JButton btnThree;
    private JButton btnFour;
    private JButton btnFive;
    private JButton btnSix;
    private JButton btnSeven;
    private JButton btnEight;
    private JButton btnNine;
    private JButton btnZero;
    private JButton btnPlus;
    private JButton btnMinus;
    private JButton btnMultiply;
    private JButton btnDivide;
    private JButton btnEquals;
    private JLabel label;
    
    public BasicCalculator(){
        textField = new JTextField(11);
        btnOne = new JButton("1");
        btnTwo = new JButton("2");
        btnThree = new JButton("3");
        btnFour = new JButton("4");
        btnFive = new JButton("5");
        btnSix = new JButton("6");
        btnSeven = new JButton("7");
        btnEight = new JButton("8");
        btnNine = new JButton("9");
        btnZero = new JButton("0");
        
        btnPlus = new JButton("+");
        btnMinus = new JButton("-");
        btnMultiply = new JButton("*");
        btnDivide = new JButton("/");
        btnEquals = new JButton("=");
        
        label = new JLabel();
        setLayout(new FlowLayout());
        
        JPanel displayPanel = new JPanel(new GridLayout(2, 1));
        displayPanel.add(label);
        displayPanel.add(textField);
        
        JPanel btnPanel = new JPanel(new GridLayout(5,3));
        btnPanel.add(btnOne);
        btnPanel.add(btnTwo);
        btnPanel.add(btnThree);
        btnPanel.add(btnFour);
        btnPanel.add(btnFive);
        btnPanel.add(btnSix);
        btnPanel.add(btnSeven);
        btnPanel.add(btnEight);
        btnPanel.add(btnNine);  
        btnPanel.add(btnPlus);
        btnPanel.add(btnZero);        
        btnPanel.add(btnMinus);
        btnPanel.add(btnMultiply);
        btnPanel.add(btnDivide);
        btnPanel.add(btnEquals);
        
        btnOne.addActionListener(this);
        btnTwo.addActionListener(this);
        btnThree.addActionListener(this);
        btnFour.addActionListener(this);
        btnFive.addActionListener(this);
        btnSix.addActionListener(this);
        btnSeven.addActionListener(this);
        btnEight.addActionListener(this);
        btnNine.addActionListener(this);
        btnZero.addActionListener(this);
        btnPlus.addActionListener(this);
        btnMinus.addActionListener(this);
        btnMultiply.addActionListener(this);
        btnDivide.addActionListener(this);
        btnEquals.addActionListener(this);
        
        add(displayPanel);
        add(btnPanel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(180,240);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        BasicCalculator calc = new BasicCalculator();
    }
    
    public void actionPerformed(ActionEvent ae){
        String button = ae.getActionCommand();
        String input = textField.getText();
        int res = 0;
        
        if(button.matches("[+-/*]")){
            num1 = Integer.valueOf(input);
            textField.setText(""); 
            symbol = button.charAt(0);            
        }else if(button.matches("[=]")){
            if(num1 == -1)
                return;
            num2 = Integer.valueOf(input);
            
            if( symbol == '+')
                res = num1 + num2;
            else if(symbol == '-')
                res = num1 - num2;
            else if(symbol == '*')
                res = num1 * num2;
            else if(symbol == '/')
                res = num1 / num2;
            
            textField.setText("");
            label.setText(String.valueOf(res));
            num1 = -1;
            num2 = -1;
        }else{
            input += ae.getActionCommand();
            textField.setText(input);
            label.setText("");
        }
    }
}