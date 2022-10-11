
public class Fera extends Combatente {

	public Fera(String identificacao) {
		super(identificacao);
		nivelEnergia = 200;
	}

	public int morder() {
		return 20;
	}
	
	public int usarGarra() {
		return 10;
	}

	@Override
	public void atacar(Combatente adversario) {		
		if (Math.random() > 0.5) {
			adversario.defender(this.morder());
		}else {
			adversario.defender(this.usarGarra());
		}
	}
	

}
