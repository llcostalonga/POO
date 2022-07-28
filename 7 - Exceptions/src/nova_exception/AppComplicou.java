package nova_exception;

public class AppComplicou {

	public static void main(String[] args) {
		
		String nome = "G suis"; //"33"
		int numero = 0;
		try{
		
			 numero = Integer.parseInt(nome);
		
		}catch(NumberFormatException e){
			
			try{
			numero = Integer.parseInt("G suis");
			}catch(NumberFormatException ex){
				System.out.println("Pow...ta de saca!");
			}finally{
				System.out.println("Desliga a luz!");
			}
			
			System.out.println("Desculpe...escreveu uma string ao inves de numero.");
			
		}finally{
			System.out.println("Desliga a luz...ja falei!!");
		}
		
		
		
	}

}
