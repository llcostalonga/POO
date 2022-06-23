import java.util.*;

public class Carro {
	public String modelo;
	public char[] placa;
	
	private ArrayList<Multa> multas = new ArrayList();
	
	public void aplicarMulta(Multa multa) {
		multas.add(multa);
	}

	@Override
	public String toString() {
		String retorno = "Carro [modelo=" + modelo + ", placa=" + Arrays.toString(placa);
		
		if(multas.size() >0) retorno+= ", multas= ";
		
		for (Iterator iterator = multas.iterator(); iterator.hasNext();) {
			Multa multa = (Multa) iterator.next();
			retorno+= "\n  -" + multa.descricao + " R$" + multa.valor;
		}
		
	
		return retorno + "]";
	}
	

}
