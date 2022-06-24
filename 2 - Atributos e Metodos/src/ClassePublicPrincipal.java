
public class ClassePublicPrincipal {
	private ExInnerClass ex = new ExInnerClass();
	
	
	public ExInnerClass getInnerClassFulano(){
		return ex;
	}


	public ExInnerClass getEx() {
		return ex;
	}


	public void setEx(ExInnerClass ex) {
		this.ex = ex;
	}
	
	private String primeiroNome = "Leandro";
	private String sobrenome = "Costalonga";
	public String getNome(){
		return primeiroNome + " " + sobrenome;
	}
	
}

class ExInnerClass{
	
}
