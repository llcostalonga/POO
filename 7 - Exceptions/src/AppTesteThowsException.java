import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class AppTesteThowsException {
	
	public void fazAlgoPerigoso() throws FileNotFoundException{
		
		int numero = Integer.parseInt("Dois"); //runtime error
		
		int vetorQualquer[] = new int[10];
		
		vetorQualquer[11]++; //runtime error
		
		File file=new File("nomeArquivo.txt");

		FileReader fr = new FileReader(file);
			
	}
	
	public static void main(String[] args) {
		AppTesteThowsException obj = new AppTesteThowsException();
		
		try {
		
			obj.fazAlgoPerigoso();
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
