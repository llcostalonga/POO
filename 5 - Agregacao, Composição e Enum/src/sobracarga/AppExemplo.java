package sobracarga;

public class AppExemplo {

	public static void main(String[] args) {
	
		Object integer = new Integer(34);
		
		int valor = 10;
					
		try{
		
			Integer teste = (Integer)integer;
			
			valor = valor/0;
		
		}catch(ClassCastException ex){
			System.out.println("Prezado usário...deu um xabuzinho aqui...mas vai sobriviver");
		
		}catch(Exception ex){
			System.out.println("Prezado usário....pane geral...perdeu tudo,,,morreu.");
			
		}finally{
			System.out.println("Foi mal aí veio.");
			System.exit(1);
			
		}
			
		
		
		

	}

}
