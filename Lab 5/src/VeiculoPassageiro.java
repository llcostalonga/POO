import java.util.Iterator;

public class VeiculoPassageiro extends Veiculo {
	
	int qtdPassageiros;

	public VeiculoPassageiro(String modelo, String placa, int qtdPassageiros) {
		super(modelo, placa);
		this.qtdPassageiros = qtdPassageiros;
	}

	@Override
	public String toString() {
		String retorno = "Veiculo Passageiro [modelo=" + modelo + ", placa=" + placa;
		
		if(multas.size() >0) retorno+= ", multas= ";
		
		for (Iterator iterator = multas.iterator(); iterator.hasNext();) {
			Multa multa = (Multa) iterator.next();
			retorno+= "\n  -" + multa.descricao + " R$" + multa.valor;
		}
		
	
		return retorno + "]";
	}

	
}
