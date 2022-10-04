package sala_aula;

import java.util.Iterator;

public class App {
	public static void main(String[] args) {
		
		String placa = "XXX";
		
		char d1 = (char)(65+ ((int)(Math.random()*26)));
		//System.out.println(d1);
				
		int numAlet = ((int)(Math.random()*10));
		int seq = ((int)(Math.random()*1000));
		
		//System.out.println(placa + numAlet + d1 + seq);
		
		//==================
		
		Classe instancia1 = new Classe();
		//instancia1.atributo = 1;
		Classe instancia2 = new Classe();
		//instancia2.atributo = 2;
		Classe instancia3 = new Classe();
		
		
		/*System.out.println(instancia1.atributo);
		System.out.println(instancia2.atributo);
		System.out.println(Classe.atributo);*/
		
		//========
		
		
		Proprietario leandro = new Proprietario();
		
		leandro.getGaragem().add(new Carro());
		
		
		
		String placaZ = ((Carro)leandro.getGaragem().get(0)).getPlaca();
		System.out.println(placaZ);
		
		placaZ = "ZZZ";
		
		System.out.println(((Carro)leandro.getGaragem().get(0)).getPlaca());
		
		
		
		for (int i = 0; i < leandro.getGaragem().size(); i++) {
			//System.out.println((((Carro)leandro.getGaragem().get(i)).getNumModelo()(Carro)leandro.getGaragem().get(i)).getNumModelo());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
