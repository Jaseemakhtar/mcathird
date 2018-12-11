import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author jaseem
 */


/*
<applet code="ComputeFactorial" width="180" height="200" > </applet>
*/
public class ComputeFactorial extends Applet implements ActionListener{
    int fib1 = 0, fib2 = 1 , fib3 = 0;
    TextField txtInput1;
    TextField txtInput2;
    Button btnCompute;
    
    public void init() {
        setLayout(new GridLayout(3, 0));
        txtInput1 = new TextField();
        txtInput2 = new TextField();
        btnCompute = new Button("Compute");
        btnCompute.addActionListener(this);
	
        add(txtInput1);
        add(txtInput2);
        add(btnCompute);
    }
    
    
    public void draw(Graphics g){
        
    }

    public void actionPerformed(ActionEvent e) {
        
	String input = txtInput1.getText();
	input = input.trim();
	if(input.equals("")){
		return;
	}
	
	int n = Integer.valueOf(input);
	int sum = 1;
	if(n < 2){
		txtInput2.setText("" + 0);
	}else if(n == 2){
		txtInput2.setText("" + 1);	
	}else if(n > 2){
		for(int i=2; i<n; ++i){
			fib3 = fib1 + fib2;
			fib1 = fib2;
			fib2 = fib3;
			sum += fib3;
		}
		txtInput2.setText("" + sum);
		fib1 = 0;
		fib2 = 1;
	}
    }
}