package exemplo_observer;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Lutador {
	int vida = 100;
	private PropertyChangeSupport fofoqueiro;
	
	public Lutador() {
		super();
		fofoqueiro = new PropertyChangeSupport(this);
		vida = 100;
	}

	
	public void defender(int ataque) {
		vida = vida - ataque;
		fofoqueiro.firePropertyChange("vida", (this.vida + ataque), vida);
		
	}
	
	public void addEspectador(PropertyChangeListener espectador) {
		fofoqueiro.addPropertyChangeListener(espectador);
	}

}
