
public class AppDetran {
	
	public void testarCriacaoCarros() {
		Carro carro = new Carro();
		carro.modelo = "Chevette";
		
		Carro segundoCarro = new Carro();
		segundoCarro.modelo = "opala";
		segundoCarro.placa = "1234567".toCharArray();
		
		Proprietario dono = new Proprietario();
		dono.nome = "Joaquim";
		dono.meuCarro = carro;
		dono.meuSegundoCarro = segundoCarro;
		
		dono.listarCarros();
	}
	
	public void testarAplicacaoMultas() {
		Carro segundoCarro = new Carro();
		segundoCarro.modelo = "opala";
		segundoCarro.placa = "1234567".toCharArray();
		
		Multa multa1 = new Multa();
		multa1.descricao = "excesso de velocidade";
		multa1.valor = 100;
		
		Multa multa2 = new Multa();
		multa2.descricao = "ultrapassagem faixa dupla";
		multa2.valor = 200;
		
		segundoCarro.aplicarMulta(multa1);
		segundoCarro.aplicarMulta(multa2);
		
		Proprietario dono = new Proprietario();
		dono.nome = "Zequinha";
		dono.meuSegundoCarro = segundoCarro;
		
		dono.listarCarros();
		
	}
	

	public static void main(String[] args) {
		
		AppDetran detran = new AppDetran();
		
		detran.testarCriacaoCarros();
		
		detran.testarAplicacaoMultas();
		
	}

}
