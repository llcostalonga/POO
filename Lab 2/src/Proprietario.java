
public class Proprietario {
	public String nome;
	public Carro meuCarro;
	public Carro meuSegundoCarro;
	
	public String cnh;
	
	
	public void listarCarros() {
		System.out.println("Propietário: " + nome);
		if (meuCarro != null) System.out.println(meuCarro);
		if (meuSegundoCarro != null) System.out.println(meuSegundoCarro);
	}
	
}
