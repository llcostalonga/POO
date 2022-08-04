package br.ufes.llcostalonga.lab10;

public class Judoca extends Lutador implements Judo {

	/*public Judoca(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}*/

	public Judoca() {
		super("Judoca sem nome " +sequencialNome++, 100);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ipponSeioiNague() {
		System.out.println("Ippon");

	}

	@Override
	public void haraiGoshi() {
		System.out.println("Ippon");

	}

}
