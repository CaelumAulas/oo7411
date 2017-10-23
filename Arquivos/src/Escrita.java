import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Escrita {

	public static void main(String[] args) throws IOException {
		
		OutputStream os = new FileOutputStream("saida.txt");
		OutputStreamWriter osr = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osr);
		
		String texto = "Caelum";
		
		bw.write(texto);
		bw.newLine();
		
		bw.close();
	}
}
