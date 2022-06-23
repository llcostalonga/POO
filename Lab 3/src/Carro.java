import java.util.*;

public class Carro {
	public String modelo;
	public String placa;
	
	private ArrayList<Multa> multas = new ArrayList();
	
	
	public Carro(String modelo, String placa){
	  this.modelo = modelo;
	  this.placa = placa;
	}
	
	
	
	public void aplicarMulta(Multa multa) {
		multas.add(multa);
	}

	@Override
	public String toString() {
		String retorno = "Carro [modelo=" + modelo + ", placa=" + placa;
		
		if(multas.size() >0) retorno+= ", multas= ";
		
		for (Iterator iterator = multas.iterator(); iterator.hasNext();) {
			Multa multa = (Multa) iterator.next();
			retorno+= "\n  -" + multa.descricao + " R$" + multa.valor;
		}
		
	
		return retorno + "]";
	}
	

}
