import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author jaseem
 */
public class TicTacToeTester extends JFrame implements ActionListener{

    private JButton[] btns;
    private boolean playerClicked;
    private int[] playerX;
    private int[] playerO;
    
    public TicTacToeTester(){
        btns = new JButton[9];
        
        playerX = new int[9];
        playerO = new int[9];
        
        setLayout(new GridLayout(3,3));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 400);
        
        for(int i=0; i < btns.length; i++){
            playerX[i] = 1;
            playerO[i] = 1;
            btns[i] = new JButton();
            btns[i].setActionCommand(String.valueOf(i));
            btns[i].addActionListener(this);
            add(btns[i]);
        }
        
        setTitle("TicTacToe - by Jaseem");
        setResizable(false);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        
        for(int i=0; i < btns.length; i++){
           if(button == btns[i]){
               if(playerClicked){
                    button.setText("O");   
                    playerClicked = false;   
                    playerO[i] = 2;
               }else{
                   button.setText("X");
                   playerClicked = true; 
                   playerX[i] = 2;  
               }
               
               button.removeActionListener(this);
           }
           
           
        }
    }
    
    
}
