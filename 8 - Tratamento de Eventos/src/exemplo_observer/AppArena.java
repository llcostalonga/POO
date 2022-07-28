package exemplo_observer;

public class AppArena {
	
	public static void main(String[] args) {
		
		
		Lutador lutador = new Lutador();
		lutador.addEspectador(new Espectador());
		
		//Debugar para demonstrar
		lutador.defender(100);
		
	}

}
