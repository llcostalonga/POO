package atividade1;

public class Banco {
	String nomeBanco;
	
	//Associação (*)
	ContaBancaria[] contas;
	
	public void abrirConta(Correntista cliente, double saldoInicial){
		int qtContaAbertas = contas.length;
		
		ContaBancaria novaConta = new ContaBancaria();
		novaConta.correntista = cliente; //associação.
		novaConta.saldo = saldoInicial;
		novaConta.agencia = 123;
			
		contas[qtContaAbertas + 1] = novaConta;	
	}
	
	

	
}
