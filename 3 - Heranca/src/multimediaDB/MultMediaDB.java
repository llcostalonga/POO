package multimediaDB;

public class MultMediaDB {
	
	private int qtdItensCadastrados;
	Item[] multimediaItens;
	
	
	public MultMediaDB(int capacidade){
		this.multimediaItens = new Item[capacidade];
		qtdItensCadastrados = 0;
	}
	
	
	public void listarMusicas(){
		for (int i = 0; i < multimediaItens.length; i++) {
			if(multimediaItens[i] instanceof Musica){
				System.out.println(multimediaItens[i].titulo);
			}
		}
	}
	
	public boolean addItem(Item item){
	  if(qtdItensCadastrados < multimediaItens.length){	
		multimediaItens[qtdItensCadastrados] = item;
		qtdItensCadastrados++;
		
		return true;
	  
	  }
	  return false;
	}
	
	

	public static void main(String[] args) {
		
		MultMediaDB db = new MultMediaDB(10);
		
	   Item item = new Item("Item 1");
		
       Item item2 = new Musica("Musica 1");
		
	   Item item3 = new Video("Video 1");
		
       Musica musica1 = new Musica("Ye ye");
       
       
       db.addItem(item);
       db.addItem(item2);
       db.addItem(item3);
       db.addItem(musica1);
       
       db.listarMusicas();
       
       
       System.out.println("tudo certo até aqui!");
	   
	   
	   
	}

	
	
	
	
	
	
	
	
	
}
