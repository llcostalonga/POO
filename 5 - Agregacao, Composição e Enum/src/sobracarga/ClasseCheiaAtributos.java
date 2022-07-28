package sobracarga;

public class ClasseCheiaAtributos {
	private int atributoInteiro1;
	private int atributoInteiro2;
	private int atributoInteiro3;
	private double atributoDouble1;
	private double atributoDouble2;
	private String string1;
	private String string2;
	
	
	public void informarValores(int atributoInteiro1, double atributoDouble1, String string1){
		this.atributoInteiro1 = atributoInteiro1;
		this.atributoDouble1 = atributoDouble1;
		this.string1 = string1;
		
	}
	
	public void informarValores( double atributoDouble2,int atributoInteiro2, String string2){
		this.atributoInteiro2 = atributoInteiro2;
		this.atributoDouble2 = atributoDouble2;
		this.string2 = string2;
		
	}
	
	
	public int getAtributoInteiro1() {
		return atributoInteiro1;
	}
	public void setAtributoInteiro1(int atributoInteiro1) {
		this.atributoInteiro1 = atributoInteiro1;
	}
	public int getAtributoInteiro2() {
		return atributoInteiro2;
	}
	public void setAtributoInteiro2(int atributoInteiro2) {
		this.atributoInteiro2 = atributoInteiro2;
	}
	public int getAtributoInteiro3() {
		return atributoInteiro3;
	}
	public void setAtributoInteiro3(int atributoInteiro3) {
		this.atributoInteiro3 = atributoInteiro3;
	}
	public double getAtributoDouble1() {
		return atributoDouble1;
	}
	public void setAtributoDouble1(double atributoDouble1) {
		this.atributoDouble1 = atributoDouble1;
	}
	public double getAtributoDouble2() {
		return atributoDouble2;
	}
	public void setAtributoDouble2(double atributoDouble2) {
		this.atributoDouble2 = atributoDouble2;
	}
	public String getString1() {
		return string1;
	}
	public void setString1(String string1) {
		this.string1 = string1;
	}
	public String getString2() {
		return string2;
	}
	public void setString2(String string2) {
		this.string2 = string2;
	}

	


}
