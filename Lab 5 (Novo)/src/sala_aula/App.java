package sala_aula;

public class App {
	double versao;
	String nomeComercial;
	String categoria;
	
	public App(double versao, String nomeComercial, String categoria) {
		super();
		this.versao = versao;
		this.nomeComercial = nomeComercial;
		this.categoria = categoria;
	}



	@Override
	public String toString() {
		return (nomeComercial + versao);
	}



	public static void main(String[] args) {
		//tipos primitivos
		int valorInteiro = 100;
		double valorDouble = 89.97;
		boolean valorBoolean = false;
		//Excecao String
		String valorString = "Text";
		
		//Objetos
		App appFavorito = new App(1.0, "Alcadun","produtividade");
		App appMaisUsado = new App(3.0, "Msg","comunicacao");
		
		
		System.out.println(appFavorito + " " + appMaisUsado);
		
	}

}
