
public class AppArena {
	
	public static void main(String[] args) {
		
		//Lutador vitorBelford = new Lutador("Vitor Belford");
		//Combatente andersonSilva = new Combatente("Spider");
		
		Combatente[] combatentes = new Combatente[10];
		combatentes[0] = new Lutador("Vitor Belford");
		combatentes[1] = new Combatente("Spider");
		
		combatentes[0].atacar(combatentes[1]);
		if(combatentes[1].estaVivo()) {
			combatentes[1].atacar(combatentes[0]);
		 }
		
		
	}

}
