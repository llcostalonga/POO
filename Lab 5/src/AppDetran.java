import java.math.*;
import java.util.Iterator;

public class AppDetran {
	
	public Proprietario criarPropietarioRandomico() {
		
		Proprietario proprietario = new Proprietario("Zezinho " + Math.random() );
		proprietario.setCnh("ES" + Math.random() * 10000);
		
		return proprietario;
		
	}
	
	public Veiculo criarVeiculoRandomico() {
		String modelos[] = {"pulse", "renegade", "compass", "uno", "onix", "s10"};
		
		int indiceSorteio = (int) (Math.random() * modelos.length);
		String placa = GeradorPlacas.getPlaca();
		
		Veiculo veiculo = new Veiculo(modelos[indiceSorteio], placa);
		
		if(Math.random() > 0.5) {
			veiculo = new VeiculoPassageiro(modelos[indiceSorteio], placa,4);
		}else {
			 veiculo = new VeiculoCarga(modelos[indiceSorteio], placa, 100);
		}
		
		return veiculo;
	}
		
	public void registrarVeiculo(Proprietario proprietario, Veiculo carro) {		
		proprietario.adicionarCarro(carro);
	}
	

	public void multarVeiculo(Veiculo carro) {
		carro.aplicarMulta(new Multa("Infração Grave", 1000));
	}
	
	public static void main(String[] args) {
		
		AppDetran detran = new AppDetran();
		
        for (int i = 0; i < 3; i++) {
			Proprietario p = detran.criarPropietarioRandomico();
	        for (int j = 0; j < 3; j++) {
				Veiculo carro = detran.criarVeiculoRandomico();
				p.adicionarCarro(carro);
				
				if(Math.random() > 0.5) {
					carro.aplicarMulta(new Multa("Barberagem", 100));
				}
			}
			p.listarCarros();
		}
		
		
		

		
	}

}
