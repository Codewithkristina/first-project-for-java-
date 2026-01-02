# first-project-for-java-
This is my first project of java where i impliment all the basics of java i have learnt till now. 
<br> 

Author : Kristina Ghimire(code with kristina)

<br>
<h1>TicTacToe file </h1>
import java.awt.* - AWT(abstract window toolkit) is java's basic Gui library which provides classes to create visible components like frame,button,label,panel,etc.
<br>
import java.awt.event.*; - this package handles user actions(events). it provides classes and interfaces for event handling: Actionlistener, ActionEvent, MouseListener, keylistener,etc. 
<br>
import javax.swing.*; - Swing is java's modern GUI library. It provides Advanced gui components like JFrame , JButton, JLabel, JTextField, JPanel, JOptionPane, JCheckBox 

<br>


public class TicTacToe 
   int broadwidth = 600 - this is the width of the frame to be created      <br>
   int broadheight = 650 - 50px is where we will write about the file name. <br>
   JFrame frame = new JFrame();- the class JFrame is already in the package javax swing this is used to create the frame. (create window). <br>
   JLabel textlabel = new JLabel(); - this is for the text <br>
   JPanel textpanel = new JPanel(); - this is the container <br>

   TicTacToe() {
      frame.setSize(broadwidth, broadheight);        size                     <br>
      frame.setLocationRelativeTo((Component)null); center the frame<br>
      frame.setResizable(false);                     to lock the frame<br>
      frame.setDefaultCloseOperation(3);             to exit the frame<br>
      frame.setLayout(new BorderLayout());           for the boarder<br>
      textlabel.setBackground(Color.darkGray);       background<br>
      textlabel.setForeground(Color.white);          color<br>
      textlabel.setFont(new Font("Arial", 1, 50));   font <br>
      textlabel.setHorizontalAlignment(JLabel.CENTER); alignment like to keep <br>the label at the top
      textlabel.setText("Tic Tac Toe");<br>
      textlabel.setOpaque(true); it is for visibility<br>
      textpanel.setLayout(new BorderLayout()); layout of the panel where the t<br>ext will be kept 
      textpanel.add(textlabel); adding the text<br>
      frame.add (textpanel, "North"); positining in the top<br>
      frame.setVisible(true); // displaying <br>
   } 