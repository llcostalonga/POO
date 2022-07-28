import java.util.ArrayList;

public class Gladiador extends Lutador {
	
	ArrayList<Armadura> armaduras = new ArrayList<Armadura>(); 
	ArrayList<Arma> armas = new ArrayList<Arma>();
	
	
	public Gladiador(String nome, double nivelEnergia) {
		super(nome, nivelEnergia);
		armaduras = new ArrayList<>();
		armas = new ArrayList<>();	
	}


	/*public Gladiador(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}*/


    	
	public Gladiador() {				
		super("Gladiador sem nome " +sequencialNome++,100);		
		
		armaduras = new ArrayList<>();
		armaduras.add(new Armadura("Armadura de Corpo", 0.5,1));
		
		armas = new ArrayList<>();		
		
		Arma espada =new Arma("Escalibur");
		espada.addGolpe("Ataque frontal", 50);
		espada.addGolpe("Ataque Lateral", 40);
		armas.add(espada);
	
	}


	public void addArmaduras(ArrayList<Armadura> armaduras) {
		this.armaduras.addAll(armaduras);
	}
	
	public void addArmadura(Armadura armadura) {
		armaduras.add(armadura);
	}
	
	public Armadura getArmadura(String nomeArmadura) {
		
		for (Armadura armadura : armaduras) {
			if(armadura.descricao.equals(nomeArmadura)) {
				return armadura;
			}
		}
		return null;
		
	}
	
	public void addArma(Arma arma) {
		armas.add(arma);
	}

	public void addArmas(ArrayList<Arma> armas) {
		this.armas.addAll(armas);
	}
	
	//Implementação para resolução do Lab 8
	public Arma getArma(String nomeArma) {
		
		for (Arma arma : armas) {
			if(arma.descricao.equals(nomeArma)) {
				return arma;
			}
		}
		return null;
		
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
	public String textToCSV() {
		String retorno = "";	
		String header = "Gladiador;" + this.nome +";" + String.format("%.2f", this.ENERGIA_DEFAULT) + ";";
		
		for (Arma arma : armas) {
			ArrayList<Golpe> golpes = arma.getGolpes();
			for (Golpe golpe : golpes) {
				retorno+=header + arma.descricao + ";" + golpe.nomeGolpe + ";" + String.format("%.2f", golpe.poderOfensivo) + "\r\n";
			}
		}
		
		for (Armadura armadura : armaduras) {
			retorno+=header + ";;;" + armadura.descricao+ ";" +String.format("%.2f",armadura.poderDefesa) + ";" + String.format("%.2f",armadura.poderDefesa) + "\r\n";
		}
		
		return retorno;
	};


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