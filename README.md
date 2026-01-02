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
JFrame is used to make the frame pop up in the screen. 
1. frame.setvisible is to make the frame visible
2. frame.setSize(width,height) is for the size of the frame 
3. frame.setLocatiomRelativeTo(null); this is for the frame to come in the middle like not at the side or anything like that. 
4. frame.setresizable(false) - made so that we cannot resize the file since it will mess with the placing 
5. frame.setDefaultCloseOperation(jframe)

public class TicTacToe 
   int broadwidth = 600 - this is the width of the frame to be created
   int broadheight = 650 - 50px is where we will write about the file name. 
   JFrame frame = new JFrame();- the class JFrame is already in the package javax swing this is used to create the frame. (create window). 
   JLabel textlabel = new JLabel(); - this is for the text
   JPanel textpanel = new JPanel(); - this is the container

   TicTacToe() {
      frame.setSize(broadwidth, broadheight);   size          
      frame.setLocationRelativeTo((Component)null); center the frame
      frame.setResizable(false); to lock the frame
      frame.setDefaultCloseOperation(3); to exit the frame
      frame.setLayout(new BorderLayout()); for the boarder
      textlabel.setBackground(Color.darkGray); background
      textlabel.setForeground(Color.white); color
      textlabel.setFont(new Font("Arial", 1, 50)); font 
      textlabel.setHorizontalAlignment(JLabel.CENTER); alignment like to keep the label at the top
      textlabel.setText("Tic Tac Toe");
      textlabel.setOpaque(true); it is for visibility
      textpanel.setLayout(new BorderLayout()); layout of the panel where the text will be kept 
      textpanel.add(textlabel); adding the text
      frame.add (textpanel, "North"); positining in the top
      frame.setVisible(true); // displaying 
   } 