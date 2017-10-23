import java.util.ArrayList;
import java.util.List;

public class TesteWrapper {

	public static void main(String[] args) {
		
		String idade = "21";
		int idadeNum = Integer.parseInt(idade);
		
		int numero = 10;
		
		// wrappers
		Integer numObjeto = Integer.valueOf(numero);
		int numDeVolta = numObjeto.intValue();

		// autoboxing
		Integer idadeObj = 21;
		int primito = idadeObj;
		
		Object num = 18;
		
		List<Boolean> numeros = new ArrayList();
		numeros.add(true);
		
		// Float
		// Character
		// Double
		// Boolean
		
	}
}
