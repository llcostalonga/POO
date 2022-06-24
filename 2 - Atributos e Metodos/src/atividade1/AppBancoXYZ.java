package atividade1;

public class AppBancoXYZ {
	

	public static void main(String[] args) {
		
		Banco banco = new Banco();
		banco.contas = new ContaBancaria[5];
		
		Correntista correntista1 = new Correntista();
		correntista1.nome = "Fulano";
		correntista1.usuarioIB = "fufu";
		correntista1.senhaIB = "12346";
		
		
		ContaBancaria novaConta = new ContaBancaria();
		novaConta.agencia = 123;
		novaConta.numConta = 8123L;
		novaConta.saldo = 0.0;
		
		
		novaConta.correntista = correntista1;
		
		System.out.println("Bem vindo a conta " + novaConta.numConta + 
							" " + correntista1.nome);		
		
		banco.contas[0] = novaConta;
	}
		
		
	

}
