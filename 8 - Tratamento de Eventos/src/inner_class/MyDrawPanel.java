package inner_class;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyDrawPanel extends JPanel {

          public void paintComponent(Graphics g  ) {

		Random generator = new Random();
		int numero= generator.nextInt(9);

		switch (numero){
			case 0:
				g.setColor(Color.blue);
				break;	
			case 1:
				g.setColor(Color.orange);
				break;
			case 2:
				g.setColor(Color.yellow);
				break;
			case 3:
				g.setColor(Color.pink);
				break;
			case 4:
				g.setColor(Color.red);
				break;
			case 5:
				g.setColor(Color.green);
				break;
			case 6:
				g.setColor(Color.cyan);
				break;
			case 7:
				g.setColor(Color.magenta);
				break;
			case 8:
				g.setColor(Color.black);
				break;
		} //fin del switch

		g.fillRect(70,70,200,100);

	  } //fin del metodo paintComponent
} //fin de la clase
