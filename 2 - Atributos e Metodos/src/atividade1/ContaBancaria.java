package atividade1;

public class ContaBancaria {

	int agencia;
	Long numConta;
	double saldo;
	
	//Associação
	Correntista correntista;
	
	
	public void depositarValor(double valorDeposito){
		saldo+=valorDeposito;
	}
	
	public double consultarSaldo(){
		return saldo;
	}
	
	public boolean retirarValor(double valorRetirada){
		if(valorRetirada >= saldo){
			saldo -= valorRetirada;
			return true; // saque bem sucedido.
		}
		return false; //não há fundos para retirada.
	}
	
}
