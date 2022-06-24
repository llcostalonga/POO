package multimediaDB;

import java.util.ArrayList;

public class AppTesteSobrescrita {

	public static void main(String[] args) {
		ArrayList<Item> lista = new ArrayList<Item>();

		
		Item item1 = new Item("Item 1");
		Item item2 = new Musica("Musica 1");
		Item item3 = new Video("Video 1");
		
		
		lista.add(item1);
		lista.add(item2);
		lista.add(item3);

		for (Item item : lista) {
			item.print();
		}




	}

}
