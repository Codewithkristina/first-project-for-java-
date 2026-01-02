import java.util.* ;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TicTacToe {
    int broadwidth = 600;
    int broadheight = 650; 
    JFrame frame = new JFrame("Tic-Tac-Toe game");
    JLabel textlabel = new JLabel();
    JPanel textpanel = new JPanel();
    JPanel boardPanel = new JPanel();
    
    JButton[][] boards = new JButton[3][3];
    String playerX = "X";
    String playerO = "O";
    String currentPlayer = playerX;

    

    TicTacToe() {
        
        frame.setSize(broadwidth, broadheight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        textlabel.setBackground(Color.darkGray);
        textlabel.setForeground(Color.white);
        textlabel.setFont(new Font("Arial", Font.BOLD, 50));
        textlabel.setHorizontalAlignment(JLabel.CENTER);
        textlabel.setText("Tic Tac Toe");
        textlabel.setOpaque(true);

        textpanel.setLayout(new BorderLayout());
        textpanel.add(textlabel);
        frame.add(textpanel, BorderLayout.NORTH);

        boardPanel.setLayout(new GridLayout(3, 3));
        boardPanel.setBackground(Color.gray);
        frame.add(boardPanel);

        for (int r = 0; r < 3; r++) {
            for (int c = 0; c<3; c++) { 
                JButton title = new JButton();
                boards[r][c] = title;
                boardPanel.add(title);


            }

        }



        frame.setVisible(true);

    }
    public static void main(String[] args) {
        new TicTacToe();



    }
    
}
