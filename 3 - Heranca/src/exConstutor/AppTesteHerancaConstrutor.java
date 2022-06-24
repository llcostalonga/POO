package exConstutor;

public class AppTesteHerancaConstrutor {
	
	public static void main(String[] args) {
		
		//Veiculo veiculo = new Veiculo();
		
		//Automovel auto = new Automovel(123);
		
		//Veiculo auto2 = new Automovel();
	
		Veiculo veiculo = new Bicicleta();
		
		Bicicleta bici = (Bicicleta)veiculo;
		
		
	}

}
