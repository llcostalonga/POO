
public class Lutador extends Personagem implements ArteMarcial{

 
	
	//implementação para resolução do lab 8
	public Lutador(String nome, double nivelEnergia) {
		super(nome, nivelEnergia);
		// TODO Auto-generated constructor stub
	}

	/*public Lutador(String nome) {
		super(nome);
		this.nivelEnergia = 100;
	}*/

	public Lutador() {
		super("Lutador sem nome " +sequencialNome++, 100);
	}
	
	
	public boolean estaVivo() {
		if (super.nivelEnergia <= 0) return false;

		return true;
	}


	public void atacar(Personagem personagem) {
		int tipoAtaque = (int) (Math.random() * 2);

		if (tipoAtaque == 0) socar(personagem);
		else if (tipoAtaque == 1) chutar(personagem);

	}


	public void defender(double poderAtaque) {
		int tipoDefesa = (int) (Math.random() * 3);

		if (tipoDefesa == 0) esquivar(poderAtaque);
		else if (tipoDefesa == 1) fazerGuarda(poderAtaque);
		else {
			nivelEnergia = nivelEnergia - poderAtaque;
		}
	}


	public void socar(Personagem personagem) {
		personagem.defender(10);
	};

	public void chutar(Personagem personagem) {
		personagem.defender(20);
	};

	public void esquivar(double poderAtaque) {
		nivelEnergia = nivelEnergia - (poderAtaque * 0.01);
	};

	public void fazerGuarda(double poderAtaque) {
		nivelEnergia = nivelEnergia - (poderAtaque * 0.05);;
	}

	@Override
	public String textToCSV() {
		String retorno = "Lutador;" + this.nome +";" + String.format("%.2f", this.ENERGIA_DEFAULT) + "\r\n";
		return retorno;
	};

}
