package multimediaDB;

public class Musica extends Item {

	public Musica(String titulo) {
		super("Musica: "+ titulo);
	}

	String estilo;
	String nomeArtista;
	

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	public String getNomeArtista() {
		return nomeArtista;
	}

	public void setNomeArtista(String nomeArtista) {
		this.nomeArtista = nomeArtista;
	}
	
	
	public void print(){
		System.out.println("musica");
	}
	

}
