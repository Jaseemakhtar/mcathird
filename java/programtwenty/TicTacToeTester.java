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
    private int[] board;
    
    
    public TicTacToeTester(){
        btns = new JButton[9];
        board = new int[9];
        
        setLayout(new GridLayout(3,3));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 400);
        
        for(int i=0; i < btns.length; i++){
            btns[i] = new JButton();
            btns[i].setActionCommand(String.valueOf(i));
            btns[i].addActionListener(this);
            add(btns[i]);
        }
        
        setTitle("TicTacToe Game");
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
                    board[i] = 2;
               }else{
                   button.setText("X");
                   playerClicked = true;
                   board[i] = 1;
               }   
               button.removeActionListener(this);
           }
        }
        
        int player = 0;
        
        if(board[0] == board[1] && board[1] == board[2]){
            //first row
            player = board[0];
        }else if(board[3] == board[4] && board[4] == board[5]){
            //second row
            player = board[3];
        }else if(board[6] == board[7] && board[7] == board[8]){
            //third row
            player = board[6];
        }else if(board[0] == board[3] && board[3] == board[6]){
            //first column
            player = board[0];
        }else if(board[1] == board[4] && board[4] == board[7]){
            //second column
            player = board[1];
        }else if(board[2] == board[5] && board[5] == board[8]){
            //third column
            player = board[2];
        }else if(board[0] == board[4] && board[4] == board[8]){
            //pde ltr
            player = board[0];
        }else if(board[2] == board[4] && board[4] == board[6]){
            //pde rtl
            player = board[2];
        }
        
        if(player == 1){
            JOptionPane.showMessageDialog(rootPane, "X Win");
            dispose();
        }else if(player == 2){
            JOptionPane.showMessageDialog(rootPane, "O Win");
            dispose();
        }else{
            boolean draw = true;
            for(int i = 0; i < board.length; i++){
                if(board[i] == 0){
                    draw = false;
                    break;
                }
            }
            if(draw){
                JOptionPane.showMessageDialog(rootPane, "Draw");
                dispose();
            }
        }
        
    }
    
    
}

