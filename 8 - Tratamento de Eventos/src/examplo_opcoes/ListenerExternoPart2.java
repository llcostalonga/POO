package examplo_opcoes;
import java.awt.event.*;  


class ListenerExternoPart2 implements ActionListener{  
	ListenerClasseExternaPart1 obj;  
	ListenerExternoPart2(ListenerClasseExternaPart1 obj){  
		this.obj=obj;  
	}  
	public void actionPerformed(ActionEvent e){  
		obj.tf.setText("welcome");  
	}  
}  