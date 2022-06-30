import java.util.Iterator;

public class AppArena {
	Personagem[] personagens;
	
	public AppArena(int qtdPersonagens) {
		personagens = new Personagem[qtdPersonagens];
		for (int i = 0; i < personagens.length; i++) {
			personagens[i] = new Lutador();
		}
	}
	
	public AppArena(Personagem[] personagens) {
		super();
		this.personagens = personagens;
	}
	
	public int getQtdPersonagemVivos() {
		int retorno = 0;
		for (int i = 0; i < personagens.length; i++) {
			retorno += personagens[i].estaVivo()? 1:0;
		}
		return retorno;
	}
	
	
	public int getIndiceProximoVivo(int index) {
		int i = index;
		while (i != (index -1)) {
			if(i > (personagens.length - 1)) 
				i = 0;
			if(personagens[i].estaVivo()) return i;
			i++;
		}
		return -1;
	}
	
	private void realizarCombate(Personagem p1, Personagem p2) {
		System.out.println("Combate em andamento:" + p1 +" vs. " + p2);
		while (p1.estaVivo() && p2.estaVivo()) {
			p1.atacar(p2);
			if(p2.estaVivo()) {
				p2.atacar(p1);
			}
						
		}
		Personagem vencedor= p1.estaVivo()?p1:p2;
		
		System.out.println("Combate encerrado! Vencedor:" + vencedor);
	}
 	
	private void listarCombatentes() {
		System.out.println("Combatentes:");
		for (int i = 0; i < personagens.length; i++) {
			System.out.println(" "+ i + ": " + personagens[i]);
		}
	}
	
	private Personagem getCampeao() {
		for (int i = 0; i < personagens.length; i++) {
			if(personagens[i].estaVivo()) return personagens[i];
		}
		return null;
	}
	
	public void iniciarCombates() {
		listarCombatentes();
		int index = 0;
		while (getQtdPersonagemVivos() > 1) {
			int posP1 = getIndiceProximoVivo(index);
			Personagem p1 = personagens[posP1];
			index = posP1 + 1;
				
			int posP2 = getIndiceProximoVivo(index);	
			
			if(posP2 != -1) {
				Personagem p2 = personagens[posP2];
				index = posP2+1;
				realizarCombate(p1,p2);				
			}
			
		
			
			//index = index==personagens.length?0:index+1;
			
		}
		System.out.println("Fim dos Combates. Campeão do torneio:" + getCampeao());
		
	}
	
	public static void main(String[] args) {
	   AppArena arena = new AppArena(6);
	   arena.iniciarCombates();
	   
   }

}
