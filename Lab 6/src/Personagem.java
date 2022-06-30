
public abstract class Personagem {
	
	String nome;
	double nivelEnergia;
	
			
	public Personagem(String nome) {
		this.nome = nome;
	}
	
	public abstract boolean estaVivo();
	public abstract void atacar(Personagem personagem);
	public abstract void defender(double poderAtaque);
	
}
