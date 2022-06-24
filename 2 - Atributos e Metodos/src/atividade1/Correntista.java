package atividade1;

public class Correntista {
	String nome;
	Long cpf;
	
	String usuarioIB;
	String senhaIB;
	
	
	public boolean autenticarUsario(String usuarioIB, String senhaIB){
		if(usuarioIB.equalsIgnoreCase(this.usuarioIB)){
			if(senhaIB.equalsIgnoreCase(this.senhaIB)){
				return true;
			}
		}
		return false;
	}
	
	public void resetarSenha(String novaSenha){
		this.senhaIB = novaSenha;
	}
	
}
