package sala_aula;

import java.util.ArrayList;
import java.util.Iterator;

public class Proprietario {
	
	private ArrayList garagem = new ArrayList();
	
	public Proprietario() {
		for (int i = 0; i < 5; i++) {
			garagem.add(new Carro()); 
		}
		
	}
	
	public ArrayList getGaragem() {
		return garagem;
	}
	
	

}
