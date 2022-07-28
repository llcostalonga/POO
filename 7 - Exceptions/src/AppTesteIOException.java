
import java.io.*;

public class AppTesteIOException {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader (
					new InputStreamReader(System.in));

			int numeroArquivo = 0;
			try {
				numeroArquivo = Integer.parseInt(br.readLine());

			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			String nomeCompletoArquivo = "arquivo" + numeroArquivo + ".txt";

			File file=new File(nomeCompletoArquivo);

			FileReader fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



	}

}
