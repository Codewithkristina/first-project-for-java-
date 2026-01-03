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

<h2> INITIALIZATION </h2>
<b>window size </b>                                       <br>
int broadwidth = 600;<br>
int broadheight = 650;<br>
<br>
<b>JFRAME</b><br>
JFrame frane = new JFrame("Tic-Tac-Toe game");<br>
this is the main application window <br>
<br>
<b>JLabel</b><br>
Jlabel textlabel = new JLabel();<br>
this will display the text at the toplike which player's t<br>urn who won
<b>BOARD REPRESENTATION </b><br>
JButton[][] boards = new JButton[3][3];<br>
This is the game board where each cell is a button<br>
row and columns mapping mirrors real tic tac toe <br>
<b>PLAYER</b><br>
String playerx ="X";<br>
String playerY="Y";<br>
String currentPlayer = playerX;<br>
This is used to track whose turn it is <br>
currentplayer will switch after each move.<br>

<b>GAME STATE</b><br>                                  <br>
boolean gameOver = false;<br>
int turns = 0;<br>
<br>
<h2>CONSTRUCTOR</h2><br>
TicTacToe() {<br>
<br>
}<br>
this program runs when it starts <br>
this builds the entire UI<br>
<br>
<b>FRAME SETUP </b><br>
frame.setVisible(true); visibility<br>
frame.setSize(broadweight, broadheight)<br>
frame.setLocationRelativeTo(null)<br>
frame.setResizable(false)<br>
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);<br>
frame.setLayout(new BorderLayout())<br>
<br>
<b>LABEL STYLING </b><br>
textlabel.setBackground(color.darkGray)<br>
textlabel.setForeground(color.white)<br>
textlabel.setFont(new font ("Arial", Font.BOLD, 50))<br>
textlabel.setHorizontalAlignment(JLabel.CENTER)<br>
textlabel.setText("Tic Tac Toe")<br>
textlabel.setOpaque(true) - this is required for backgr<br>ound color. 
<br>
<b>ADD LABEL TO TOP</b><br>
textpanel.setLayout(new BorderLayout());<br>
text.panel.add(textlabel);<br>
frame.add(textpanel, BorderLayout.NORTH)<br>
this keeps label speraye from  the board<br>
NORTH region = top of the window<br>
<br>
<b>BOARD CREATION(Buttons)</b><br>
boardPanel.setLayout(new Gridlayout(3,3));<br>
frame.add(boardPanel);<br>
this automatically creates a 3x3 grid<br>
no manual positioning needed <br>
<br>
<b> creating 9 buttons using loops </b><br>
for (int r = 0; r < 3 ; r++){<br>
   for (int c = 0; c < 3; c++){<br>
<br>
   }<br>
}<br>
this is the nested loop <br>
<br>
<b>BUTTON CREATION </b><br>
JButton title = new JButton();<br>
boards[r][c] = title;<br>
boardPanel.add(title);<br>
this mapping lets us check winner later<br>
<br>
<b>BUTTON STYLING</b><br>
title.setBackground(Color.darkGray);<br>
title.setForeground(Color.white);<br>
title.setFont(new Font("Arial", Font.BOLD, 120));<br>
title.setFocusable(false);<br>
<br>
<b>addActionListener</b><br>
title.addActionListener(new ActionListener() {<br>
<br>
}<br>
action listener is the code that waits until the user c<br>licks something. 
<b>action performed method </b><br>
public void actionperformed(actionEvent e ){<br>
<br>
}<br>
a button is clicked <br>
<br>
<b> stop game if over </b><br>
if (gameover) return;<br>
this prevents the playing after win/draw<br>
<br>
<b> DETECT WHICH BUTTON WAS CLICKED </b><br>
JButton title = (JButton) e.getsource();<br>
e.getSource() tells you which button fired the event.<br>
<br>
<b> prevent overwriting moves</b><br>
if (title.getText() == ""){<br>
<br>
}<br>
written to check if there is any moves already in the t<br>ile so that the next player will not overwrite the moves. 
<br>
<br>





