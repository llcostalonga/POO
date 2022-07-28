package exemplo_observer;


import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Espectador implements  PropertyChangeListener {

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		int vida = ((Integer)evt.getNewValue()).intValue();
		
	    if(vida < 0) {
	    	System.out.println("Chama o coveiro!");
	    }else {
	    	 if(vida < 20) {
	 	    	System.out.println("Vixi..chama o padre!");
	 	    }else {
	 	    	 if(vida < 50) {
	 		    	System.out.println("Ai,ai,ai...hora de virar!");
	 		    }else {
	 		    	 if(vida < 70) {
	 	 		    	System.out.println("Força..vc consegue!");
	 	 		    }else {
	 	 		    	System.out.println("Pra cima dele!");
	 	 		    }
	 		    }
	 	    }
	    }
		
	}

}
