import java.util.Iterator;

public class VeiculoCarga extends Veiculo {
	
	float capacidadeCarga;

	public VeiculoCarga(String modelo, String placa, float capacidadeCarga) {
		super(modelo, placa);
		this.capacidadeCarga = capacidadeCarga;
	}

	@Override
	public String toString() {
		String retorno = "Veiculo de Carga [modelo=" + modelo + ", placa=" + placa;
		
		if(multas.size() >0) retorno+= ", multas= ";
		
		for (Iterator iterator = multas.iterator(); iterator.hasNext();) {
			Multa multa = (Multa) iterator.next();
			retorno+= "\n  -" + multa.descricao + " R$" + multa.valor;
		}
		
	
		return retorno + "]";
	}

}
