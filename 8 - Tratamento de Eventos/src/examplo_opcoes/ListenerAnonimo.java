package examplo_opcoes;


import java.awt.*;  
import java.awt.event.*;  


class ListenerAnonimo extends Frame{  
	TextField tf;  
	ListenerAnonimo(){  
		tf=new TextField();  
		tf.setBounds(60,50,170,20);  
		Button b=new Button("click me");  
		b.setBounds(50,120,80,30);  

		b.addActionListener(new ActionListener(){  
		@Override
			public void actionPerformed(ActionEvent e) {
				tf.setText("Olá");  
				
			}  
		});  
		add(b);add(tf);  
		setSize(300,300);  
		setLayout(null);  
		setVisible(true);  
	}  
	public static void main(String args[]){  
		new ListenerAnonimo();  
	}  
}  