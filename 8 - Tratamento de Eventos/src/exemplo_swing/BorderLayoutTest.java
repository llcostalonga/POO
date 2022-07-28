package exemplo_swing;

//BorderLayoutTest.java
import java.awt.*;
import javax.swing.*;

class BorderLayoutTest {
public static void main(String[] args) {
  JFrame frame = new JFrame("BorderLayout");
  
  //frame.setLayout(new FlowLayout());
  
 frame.setLayout(new BoxLayout(
		  frame . getContentPane ( ) ,
		  BoxLayout . Y_AXIS ) ) ;
  
  Container pane = frame.getContentPane();
  pane.add(
    new JButton("North Button"),BorderLayout.NORTH);
  pane.add(
    new JButton("South Button"),BorderLayout.SOUTH);
  pane.add(
    new JButton("East Button"), BorderLayout.EAST);
  pane.add(
    new JButton("West Button"), BorderLayout.WEST);
  pane.add(
    new JButton("Center Button"),
                 BorderLayout.CENTER);
  frame.pack();
  frame.show();
}
}