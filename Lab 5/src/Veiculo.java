import java.util.*;

public class Veiculo {
	 String modelo;
	 String placa;
	
	protected ArrayList<Multa> multas = new ArrayList();
	
	
	public Veiculo(String modelo, String placa){
	  this.modelo = modelo;
	  this.placa = placa;
	}
	
	
	
	public void aplicarMulta(Multa multa) {
		multas.add(multa);
	}

	@Override
	public String toString() {
		String retorno = "Veiculo [modelo=" + modelo + ", placa=" + placa;
		
		if(multas.size() >0) retorno+= ", multas= ";
		
		for (Iterator iterator = multas.iterator(); iterator.hasNext();) {
			Multa multa = (Multa) iterator.next();
			retorno+= "\n  -" + multa.descricao + " R$" + multa.valor;
		}
		
	
		return retorno + "]";
	}
	

}
