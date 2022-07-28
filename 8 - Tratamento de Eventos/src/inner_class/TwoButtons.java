package inner_class;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TwoButtons {
	
	JFrame frame;
	JLabel label;

	public static void main (String[] args) {
		TwoButtons gui = new TwoButtons();
		gui.go();
	}

	public void go() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton labelbutton = new JButton("Mudar Label");
		labelbutton.addActionListener(new LabelListener());


		JButton colorbutton = new JButton("Mudar Cor");
		colorbutton.addActionListener(new ColorListener());

		label = new JLabel("Sou um Label");

		MyDrawPanel drawPanel = new MyDrawPanel();

		frame.getContentPane().add(BorderLayout.SOUTH, colorbutton);
		frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
		frame.getContentPane().add(BorderLayout.EAST, labelbutton);
		frame.getContentPane().add(BorderLayout.WEST , label);
		frame.setSize(300,300);
		frame.setVisible(true);

	}
	
	class LabelListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			label.setText("Mudado");
		}
	}
	
	class ColorListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			frame.repaint();
		}
	}

}
