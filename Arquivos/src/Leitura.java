import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Leitura {

	public static void main(String[] args) throws IOException {

		InputStream is = new FileInputStream("entrada.txt");
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);

		String linha = br.readLine();

		while (linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}
		
		br.close();
	}
}