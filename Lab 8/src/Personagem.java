
public abstract class Personagem {
	
	static int sequencialNome = 1;
	
	String nome;
	double nivelEnergia;
	
			
	public Personagem(String nome) {
		this.nome = nome;
	}
	
	public Personagem(String nome, double nivelEnergia) {
		this.nome = nome;
		this.nivelEnergia = nivelEnergia;
	}
	
	public String toString() {
		return  this.nome + "[" + nivelEnergia +"]";
	}
	
	public abstract boolean estaVivo();
	public abstract void atacar(Personagem personagem);
	public abstract void defender(double poderAtaque);
	
}
