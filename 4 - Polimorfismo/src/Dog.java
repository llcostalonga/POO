
public class Dog extends Canine implements Pet{

	int indiceAmigabilidade;
	
	public Dog(String raca) {
		super(raca);
		
		indiceAmigabilidade = 5;
	}

	@Override
	public void brincar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void escovar() {
		if( this.porte.equals("pequeno")){
			//this.porte = "grande"; //Erro: Interface attributes are by default public, static and final
		}
		
	}
	
	

}
