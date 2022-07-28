package exemplo_swing;

import java.awt.event.*;

import javax.swing.*;



public class SimpleGui1B implements ActionListener {

    JButton button;


    public static void main (String [] args) {

	SimpleGui1B gui = new SimpleGui1B();
	gui.go();
    }

    /**
     * The go method creates a {@link JFrame} and a {@link JButton} and
     * adds an {@link ActionListener} to the button 
     * (namely, the <code>this</code> object.)
     */

    public void go () {

	JFrame frame = new JFrame();       
	button = new JButton("click me"); // now an instance variable!


	button.addActionListener(this);


	frame.getContentPane().add(button);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(300,300); 
	frame.setVisible(true); 

    } // go
    
    public void actionPerformed(ActionEvent event) {
	
	
	button.setText("I've been clicked");

    } // actionPerformed
    
    


} // class 
