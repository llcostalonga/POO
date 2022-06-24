
public class AppPolimorfismo {

	public static void main(String[] args) {
		
		Animal animal = new Hippo();
		
		//Hippo hippo = new Hippo();
		
		Canine canino = new Dog("Poodle");
		
		Animal[] animais = { animal, canino};
		
		System.out.println( "Qtd. crias:" + animais[0].procriar());
		System.out.println( "Qtd. crias:" + animais[1].procriar());
		
		Pet cachorro = new Dog("Chow chow");
		cachorro.brincar();
		
		
		
		
		
	}

}
