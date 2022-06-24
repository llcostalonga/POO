package aula;

public class App {

	public static void main(String[] args) {
		
		Esfera esfera = new Esfera(); 
		esfera.cor = "vermelha";
		esfera.peso =  100.5;
		
		Esfera segundaEsfera = esfera;
		segundaEsfera.cor = "azul";
		//segundaEsfera.peso =  100.5;
		
	
	   System.out.println(esfera.cor);	
	   //System.out.println(segundaEsfera);
	

	}

}
