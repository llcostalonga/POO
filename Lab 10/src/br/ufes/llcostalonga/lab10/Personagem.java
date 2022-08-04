package br.ufes.llcostalonga.lab10;

public abstract class Personagem {
	
	static int sequencialNome = 1;
	
	String nome;
	double nivelEnergia;
	final double ENERGIA_DEFAULT;
	
			
	/*public Personagem(String nome) {
		this.nome = nome;
	}*/
	
	public Personagem(String nome, double nivelEnergia) {
		this.nome = nome;
		this.nivelEnergia = nivelEnergia;
		ENERGIA_DEFAULT = nivelEnergia;
	}
	
	public String toString() {
		return  this.nome + "[" + nivelEnergia +"]";
	}
	
	public abstract String textToCSV(); 
	
	@Override //Resolução Lab 8
    public boolean equals(Object object)
    {
        boolean sameSame = false;

        if (object != null && object instanceof Personagem)
        {
            sameSame = this.nome.equals(((Personagem) object).nome);
        }

        return sameSame;
    }
	
	
	public abstract boolean estaVivo();
	public abstract void atacar(Personagem personagem);
	public abstract void defender(double poderAtaque);
	
}
