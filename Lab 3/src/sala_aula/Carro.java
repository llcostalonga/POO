package sala_aula;

public class Carro {
  private String placa;
  private int numModelo;
  
  public Carro() {
	  placa = "XXX" + (Math.random() * 10);
	  numModelo = (int)(Math.random() * 10);
  }
  
  public String getPlaca() {
	  return placa;
  }

public int getNumModelo() {
	return numModelo;
}

public void setNumModelo(int numModelo) {
	this.numModelo = numModelo;
}
  
}
