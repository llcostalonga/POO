package nova_exception;

public class AppFeitaParaXabu {


	public  void metodoXabuCerto (int valor) throws DeuXabuException{
		
		if (valor < 0){
			throw new DeuXabuException("Xabuuuuu", this);

		}
		
	}
	

	public static void main(String[] args) {
		try {
			
			AppFeitaParaXabu xabs = new AppFeitaParaXabu();
			
			xabs.metodoXabuCerto(-1);
		
		} catch (DeuXabuException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
