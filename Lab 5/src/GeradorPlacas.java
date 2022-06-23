
public class GeradorPlacas {
	
	static int numSequencial = 0;	
	
	
	public static String getPlaca() {
		
		
		
		char digitosPlaca[] =  {65,65,65,48,65}; //65 = A
		
		
		for (int i = 0; i < 3; i++) {
		    digitosPlaca[i]+= (int)(Math.random() * 25); 
		}
		
		digitosPlaca[3] += (int)(Math.random() * 9); ; // 57
		
	    digitosPlaca[4]+= (int)(Math.random() * 25); 
		
		String retorno = String.copyValueOf(digitosPlaca);
		
		retorno+= String.format("%03d", numSequencial++);
		
		return retorno;
		
	}
	 

}
