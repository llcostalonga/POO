package br.ufes.ceunes.llcostalonga.poo.pacote1;

public class ClasseExemplo {
	
	public int atributoPublico;
	protected int atributoProtegido;
	private int atributoPrivado;
	int atributoDefault;
	
	
	private ClasseExemplo(){
		atributoDefault = 5;
	}
	
	public static ClasseExemplo getObjectClasseExemplo(){
		return new ClasseExemplo();
	}
	
	
	

}
