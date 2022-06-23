
import java.util.*;

public class Proprietario {
	String nome;
	public String cnh;
	
	ArrayList<Carro> carros = new ArrayList();
		
	
	public Proprietario(String nome) {
		super();
		this.nome = nome;
	}

	public Proprietario(String nome, String cnh) {
		this(nome);
		this.cnh = cnh;
	}

	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}

	public void adicionarCarro(Carro carro) {
		carros.add(carro);
	}
	
	public void removerCarro(Carro carro) {
		carros.remove(carro);
	}


	public void listarCarros() {
		System.out.println("Propietário: " + nome);
	     for (Iterator iterator = carros.iterator(); iterator.hasNext();) {
			Carro carro = (Carro) iterator.next();
			System.out.println(carro);
			
		}
	}
	
}
