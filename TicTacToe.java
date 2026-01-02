import java.util.* ;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TicTacToe {
    int broadwidth = 600;
    int broadheight = 650; 
    JFrame frame = new JFrame();
    JLabel textlabel = new JLabel();
    

    TicTacToe() {
        frame.setVisible(true);
        frame.setSize(broadwidth, broadheight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

    }
    public static void main(String[] args) {
        new TicTacToe();



    }
    
}
