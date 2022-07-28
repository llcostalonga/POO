import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class AppTesteAulaException {

	public static void main(String[] args)  {
		BufferedReader br = new BufferedReader (
				new InputStreamReader(System.in));

		int numeroArquivo = 0;

		
			try {
				numeroArquivo = Integer.parseInt(br.readLine());
			} catch (NumberFormatException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	
		
	}

}
