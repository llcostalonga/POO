import java.util.ArrayList;

public class Arma implements ArmaEfeitoMoral, ArmaFogo {

	String descricao;
	ArrayList<Golpe> golpes;
	public Arma(String descricao) {	
		this.descricao = descricao;
		this.golpes = new ArrayList();
	}

	public void addGolpe(String nomeGolpe, double poderOfensivo) {
		golpes.add(new Golpe(nomeGolpe,  poderOfensivo));
	}

	public Golpe pegarGolpeRandomico() {
		if(golpes.size() > 0) {
			int tipoGolpe = (int) (Math.random() * golpes.size());
			return golpes.get(tipoGolpe);						
		}
		return null;
	}
	
	@Override
	public Golpe atirar() {
		return new Golpe("Ratata",100);
		
	}

	@Override
	public Golpe explodir() {
		return new Golpe("Kabum",1000);
		
	}

	
	@Override //Resolução Lab 8
    public boolean equals(Object object)
    {
        boolean sameSame = false;

        if (object != null && object instanceof Personagem)
        {
            sameSame = this.descricao.equals(((Arma) object).descricao);
        }

        return sameSame;
    }
	
}





