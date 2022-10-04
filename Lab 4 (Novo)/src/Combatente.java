
public class Combatente {
	
	protected String  identificacao;
	protected int nivelEnergia;
	
	
	public Combatente(String identificacao) {
		this.identificacao = identificacao;
		nivelEnergia = 100;
		
	}

	public void atacar(Combatente adversario) {
		adversario.defender((int)(Math.random() * 100));
		
	}
	
	public void defender(int poderOfensivo) {
		nivelEnergia-=poderOfensivo;
		
	}
	
	public boolean estaVivo() {
		if( nivelEnergia >= 0) return true;
		return false;
	}
	
	

}
