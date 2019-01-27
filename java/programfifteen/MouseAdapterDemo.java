import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author jaseem
 */
public class MouseAdapterDemo{
    public static void main(String[] args) {
       MyAdapter m = new MyAdapter();
    }
}

class MyAdapter extends MouseAdapter{
    JFrame frame;
    JLabel label;
    
    public MyAdapter(){
        frame = new JFrame();
        label = new JLabel();
        frame.add(label);
        frame.setSize(300, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.addMouseListener(this);
        frame.addMouseMotionListener(this);
    }
    
    public void mouseMoved(MouseEvent e) {
        super.mouseMoved(e);
        label.setText("mouseMoved: " + e.getX() + " : " + e.getY());
    }

    public void mouseReleased(MouseEvent e) {
        super.mouseReleased(e);
        label.setText("Mouse Released");
    }

    public void mousePressed(MouseEvent e) {
        super.mousePressed(e);
        label.setText("Mouse Pressed");
    }    
}