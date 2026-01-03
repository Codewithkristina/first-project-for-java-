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

    boolean gameOver = false;

    int turns = 0; 

    

    TicTacToe() {

        frame.setVisible(true);
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

                title.setBackground(Color.darkGray);
                title.setForeground(Color.white);
                title.setFont(new Font("Arial", Font.BOLD, 120));
                title.setFocusable(false);
                //title.setText(currentPlayer);

                title.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if (gameOver) {
                            return;
                        }
                        JButton title = (JButton) e.getSource();

                        if (title.getText() == "") {
                            title.setText(currentPlayer);

                         turns++;

                            checkWinner();
                            if (!gameOver) {

                            if (currentPlayer == playerX) {
                                currentPlayer = playerO;
                            } else {
                                currentPlayer = playerX;
                            }

                            
                            textlabel.setText("Player " + currentPlayer + "'s turn");
                        } 
                    }
                        
                            }
                        
                    }
                );


                


            }

        }

               


        }



                
        void checkWinner () {

            //rows horizontally 

            for (int r=0;r<3;r++) {
                if (boards[r][0].getText() == "") continue;

                if (boards[r][0].getText() == boards[r][1].getText() && boards[r][1].getText() == boards[r][2].getText()) {
                    for (int i = 0; i < 3; i++) {
                        setWinner(boards[r][i]);

                    }
                    gameOver = true;
                    textlabel.setText("Player " + currentPlayer + " wins!");
                    return;
                }

            }
            // vertically column wise
            for (int c = 0; c<3;c++){
                if(boards[0][c].getText() == "") continue;
                if (boards[0][c].getText() == boards[1][c].getText() && boards[1][c].getText() == boards[2][c].getText()) {
                    for (int i = 0; i < 3; i++) {
                        setWinner(boards[i][c]);

                    }
                    gameOver = true;
                    textlabel.setText("Player " + currentPlayer + " wins!");
                    return;
                }


            }
            // diagonally 

            if (boards [0][0].getText() == boards[1][1].getText() && 
                 boards [1][1].getText() == boards [2][2].getText() &&
                 boards[0][0].getText() != "") {
                for (int i = 0; i < 3; i++) {
                    setWinner(boards[i][i]);

                }
                gameOver = true;
                textlabel.setText("Player " + currentPlayer + " wins!");
                return;
            }

            // inverse diagonally 
            if (boards[0][2].getText() == boards[1][1].getText() &&
                boards[1][1].getText() == boards[2][0].getText() &&
                boards[0][2].getText() != ""){
                setWinner(boards[0][2]);
                setWinner(boards[1][1]);
                setWinner(boards[2][0]);
                gameOver = true;
                return;


                }

                if (turns == 9) {
                    gameOver = true;
                    textlabel.setText("It's a Draw!");
                    return;
                }
        

        }
        void setWinner (JButton title) {
            title.setBackground(Color.green);
            title.setForeground(Color.black);
            textlabel.setText("Player " + currentPlayer + " is the Winner!");


    }
    public static void main(String[] args) {
        new TicTacToe();



    }
    
}
