import java.math.*;
import java.util.Iterator;

public class AppDetran {
	
	public Proprietario criarPropietarioRandomico() {
		
		Proprietario proprietario = new Proprietario("Zezinho " + Math.random() );
		proprietario.setCnh("ES" + Math.random() * 10000);
		
		return proprietario;
		
	}
	
	public Carro criarCarroRandomico() {
		String modelos[] = {"pulse", "renegade", "compass", "uno", "onix", "s10"};
		
		int indiceSorteio = (int) (Math.random() * modelos.length);
		String placa = GeradorPlacas.getPlaca();
		
		
		Carro carro = new Carro(modelos[indiceSorteio], placa);
		
		return carro;
	}
		
	public void registrarVeiculo(Proprietario proprietario, Carro carro) {		
		proprietario.adicionarCarro(carro);
	}
	

	public void multarVeiculo(Carro carro) {
		carro.aplicarMulta(new Multa("Infração Grave", 1000));
	}
	
	public static void main(String[] args) {
		
		AppDetran detran = new AppDetran();
		
        for (int i = 0; i < 3; i++) {
			Proprietario p = detran.criarPropietarioRandomico();
	        for (int j = 0; j < 3; j++) {
				Carro carro = detran.criarCarroRandomico();
				p.adicionarCarro(carro);
				
				if(Math.random() > 0.5) {
					carro.aplicarMulta(new Multa("Barberagem", 100));
				}
			}
			p.listarCarros();
		}
		
		
		

		
	}

}
