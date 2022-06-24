package atividade1;

public class AppBancoMetodos {

	public static void main(String[] args) {
		Banco banco = new Banco();
		banco.contas = new ContaBancaria[10];
		
		
		Correntista cliente = new Correntista();
		cliente.nome = "Ciclano";
		cliente.usuarioIB = "cici";
		cliente.senhaIB = "123";
		
		
		banco.abrirConta(cliente, 10.59);
		
		
		
		
		
		

	}

}
