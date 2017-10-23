import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class TestaScanner {

	public static void main(String[] args) throws IOException {
		
		Scanner entrada = new Scanner(System.in);
		PrintStream ps = new PrintStream("saida.txt");
		
		while(entrada.hasNextLine()) {
			String linha = entrada.nextLine();
			ps.println(linha);
		}
	}
}
