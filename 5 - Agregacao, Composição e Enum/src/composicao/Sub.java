package composicao;

public final class Sub extends Super {

	private final String date;

	Sub(){
		this.date = new String("28/042016");
	}

	public void overrideMe(){
		System.out.println(date);
	}
	
	public static void main(String[] args) {
		Sub sub = new Sub();
		sub.overrideMe();
	}

}
