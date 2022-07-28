package sala_de_aula;

public class App {

	public static void main(String[] args) {
		
		MeuObjeto objA = new MeuObjeto("Leandro");
		MeuObjeto objB = new MeuObjeto("Leandro");
		
		String nomeB = "Leandro";
		
		if(nomeB == "Leandro") {
			System.out.println("Yey");
		}
		
		if(objA == objB) {
			System.out.println("Yey 2");
		}
		
		
 
	}

}
