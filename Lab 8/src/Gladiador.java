import java.util.ArrayList;

public class Gladiador extends Lutador {
	ArrayList<Armadura> armaduras; 
	ArrayList<Arma> armas;
	
    	
	public Gladiador() {				
		super("Gladiador sem nome " +sequencialNome++);
		armaduras = new ArrayList<>();
		armaduras.add(new Armadura("Armadura de Corpo", 0.5,1));
		
		armas = new ArrayList<>();		
		
		Arma espada =new Arma("Escalibur");
		espada.addGolpe("Ataque frontal", 50);
		espada.addGolpe("Ataque Lateral", 40);
		armas.add(espada);
	
	}


	public void addArmadura(ArrayList<Armadura> armaduras) {
		this.armaduras.addAll(armaduras);
	}
	

	public void addArma(ArrayList<Arma> armas) {
		this.armas.addAll(armas);
	}


	@Override
	public void atacar(Personagem personagem) {
		//super.atacar(personagem); 
		
		int tipoAtaque = (int) (Math.random() * 3);

		if (tipoAtaque == 0) socar(personagem);
		else if (tipoAtaque == 1) chutar(personagem);
		else if (tipoAtaque == 2) usarArma(personagem);
		
	}

	
	private void usarArma(Personagem personagem) {
		if(armas.size() > 0) {
			int tipoArma = (int) (Math.random() * armas.size());
			Arma arma= armas.get(tipoArma);
									
			if(Math.random() >0.5) {			
				personagem.defender(arma.pegarGolpeRandomico().poderOfensivo);
			}else {
			Golpe golpeMortal;	
			
				if(Math.random() >0.5) {			
					golpeMortal = arma.explodir();
				}else {
					golpeMortal = arma.atirar();
				}
				
				personagem.defender(golpeMortal.poderOfensivo);
			}
		}
		
	}

	@Override
	public void defender(double poderAtaque) {
		//super.defender(poderAtaque);
		
		int tipoDefesa = (int) (Math.random() * 4);

		if (tipoDefesa == 0) esquivar(poderAtaque);
		else if (tipoDefesa == 1) fazerGuarda(poderAtaque);
		else if (tipoDefesa == 2) usarArmadura(poderAtaque);
		else {
			nivelEnergia = nivelEnergia - poderAtaque;
		}
	}
	
	private void usarArmadura(double poderAtaque) {
		if(armaduras.size() > 0) {
			int tipoArmadura = (int) (Math.random() * armas.size());
			Armadura armadura= armaduras.get(tipoArmadura);
			
			double intensidadeAtaque = armadura.poderDefesa * poderAtaque;
			
			this.nivelEnergia = nivelEnergia - intensidadeAtaque;
			
			//armadura.estadoConsevacao--;
			
		}
		
	}


}

//Foi para arquivo próprio tonando-se pública;
/*
 * class Arma{ String descricao; ArrayList<Golpe> golpes; public Arma(String
 * descricao) { this.descricao = descricao; this.golpes = new ArrayList(); }
 * 
 * public void addGolpe(String nomeGolpe, double poderOfensivo) { golpes.add(new
 * Golpe(nomeGolpe, poderOfensivo)); }
 * 
 * public Golpe pegarGolpeRandomico() { if(golpes.size() > 0) { int tipoGolpe =
 * (int) (Math.random() * golpes.size()); return golpes.get(tipoGolpe); } return
 * null; }
 * 
 * 
 * }
 * 
 * class Golpe{ String nomeGolpe; double poderOfensivo; Golpe(String nomeGolpe,
 * double poderOfensivo){ this.nomeGolpe = nomeGolpe; this.poderOfensivo =
 * poderOfensivo; } }
 */
class Armadura{
	String descricao;
	double poderDefesa;
	double estadoConsevacao;
	public Armadura(String descricao, double poderDefesa, double estadoConsevacao) {
		super();
		this.descricao = descricao;
		this.poderDefesa = poderDefesa;
		this.estadoConsevacao = estadoConsevacao;
	}

	
	
	
}