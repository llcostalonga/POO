package examplo_opcoes;



import java.awt.*;  
import java.awt.event.*;  
class ListenerClasseExternaPart1 extends Frame{  
	TextField tf;  
	ListenerClasseExternaPart1(){  
		//create components  
		tf=new TextField();  
		tf.setBounds(60,50,170,20);  
		Button b=new Button("click me");  
		b.setBounds(100,120,80,30);  
		//register listener  
		ListenerExternoPart2 o=new ListenerExternoPart2(this);  
		b.addActionListener(o);//passing outer class instance  
		//add components and set size, layout and visibility  
		add(b);add(tf);  
		setSize(300,300);  
		setLayout(null);  
		setVisible(true);  
	}  
	public static void main(String args[]){  
		new ListenerClasseExternaPart1();  
	}  
}  