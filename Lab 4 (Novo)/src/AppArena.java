import java.util.Iterator;

public class AppArena {
	
	static int qtdLutadores = 0;
	static int qtdFeras = 0;
	
	//int QTD_COMBATENTES  = 10;
	private int numCobatentes;
	private Combatente combatentes[];
	
	
	public AppArena(int numCombatentes) {
	  this.numCobatentes = numCombatentes;	
	  combatentes = gerarVetorCombatentes(numCobatentes);
	}
	
	private Combatente[] gerarVetorCombatentes(int qtdCombatentes) {
		Combatente[] combatentes = new Combatente[qtdCombatentes];
		for (int i = 0; i < combatentes.length; i++) {
			if (Math.random() > 0.5) {
				combatentes[i] = new Lutador("Lutador " + qtdLutadores++);
			}else {
				combatentes[i] = new Fera("Fera " + qtdFeras++);
			}
		}
			
		return combatentes;	
		
	}
	
	
	public Combatente iniciarCombate(Combatente combatente1, Combatente combatente2) {

		int turno = 1;
		while(combatente1.estaVivo() && combatente2.estaVivo()) {
			Combatente atacante, defensor;
			if(turno ==1) {
				atacante = combatente1;
				defensor = combatente2;
			}else {
				atacante = combatente2;
				defensor = combatente1;
			}
			turno*= -1;
			System.out.println("Ataque de "+ atacante.getIdentificacao() + "[" + atacante.nivelEnergia + "]" +
			" em " + defensor.getIdentificacao() + "[" + defensor.getNivelEnergia()+"]");
			atacante.atacar(defensor);
		}

         return combatente1.estaVivo()?combatente1:combatente2;
		
	}
	
	public void iniciarTorneio() {
	   	System.out.println( "Inicio de Combate:" + combatentes[0].getIdentificacao() + 
	   			" vs." + combatentes[1].getIdentificacao());
		Combatente campeao = iniciarCombate(combatentes[0], combatentes[1]);
        System.out.println("Vencedor: " + campeao.getIdentificacao());		
	}
	
	
	
	public static void main(String[] args) {
		
		//Lutador vitorBelford = new Lutador("Vitor Belford");
		//Combatente andersonSilva = new Combatente("Spider");
		
		/*Combatente[] combatentes = new Combatente[10];
		combatentes[0] = new Lutador("Vitor Belford");
		combatentes[1] = new Combatente("Spider");
		
		combatentes[0].atacar(combatentes[1]);
		if(combatentes[1].estaVivo()) {
			combatentes[1].atacar(combatentes[0]);
		 }*/
		
		AppArena arena = new AppArena(10);
		
		arena.iniciarTorneio();
		
	}

}
