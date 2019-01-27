import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author jaseem
 */
 
/*
<applet code="StudentReport" width="400" height="400"> </applet>
*/

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class StudentReport extends Applet implements ActionListener{
	Label lblName;
	Label lblRegno;
	Label lblJava;
	Label lblNetwork;
	TextField txtName;
	TextField txtRegno;
	TextField txtJava;
	TextField txtNetwork;
	Button btnGenerate;
	String name, regno, java, network;

	public void init(){
		setLayout(null);
		lblName = new Label("Name");
		lblName.setBounds(0,10, 100, 30);

		txtName = new TextField();
		txtName.setBounds(100,10, 100, 30);

		lblRegno = new Label("Regno.");
		lblRegno.setBounds(0, 40, 100, 30);

		txtRegno = new TextField();
		txtRegno.setBounds(100, 40, 100, 30);

		lblJava = new Label("Java Marks");
		lblJava.setBounds(0, 70, 100, 30);

		txtJava = new TextField();
		txtJava.setBounds(100, 70, 100, 30);

		lblNetwork  = new Label("Network Marks");
		lblNetwork.setBounds(0, 100, 100, 30);
	
		txtNetwork = new TextField();
		txtNetwork.setBounds(100, 100, 100, 30);

		btnGenerate = new Button("Generate Report");
		btnGenerate.setBounds(0, 130 ,100, 30);
		btnGenerate.addActionListener(this);

		add(lblName);
		add(txtName);
		add(lblRegno);
		add(txtRegno);
		add(lblJava);
		add(txtJava);
		add(lblNetwork);
		add(txtNetwork);
		add(btnGenerate);
	}

	public void actionPerformed(ActionEvent ae){
		name = txtName.getText();
		regno = txtRegno.getText();
		java = txtJava.getText();
		network = txtNetwork.getText();

		Graphics g = getGraphics();
		g.drawString("-------------------------------------------------------------", 0, 180);
		g.drawString("| Name       |     Regno    |   Java   |   Network    |", 0, 200);
		g.drawString("-------------------------------------------------------------", 0, 220);
		g.drawString("  "+  name + "   |  " + regno + "   |    " + java + "   |    " + network, 0, 240);
		g.drawString("-------------------------------------------------------------", 0, 260);
	}
}
