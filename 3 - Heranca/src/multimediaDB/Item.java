package multimediaDB;

public class Item {
	
	String titulo;
	long duracao; //ms
	
	public Item(String titulo){
		this.titulo = titulo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public long getDuracao() {
		return duracao;
	}
	public void setDuracao(long duracao) {
		this.duracao = duracao;
	}
	
	public void print(){
		System.out.println("item");
	}
	
	
	

}
