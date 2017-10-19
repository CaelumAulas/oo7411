
public class Cliente implements Autenticavel {

	private String senha;

	@Override
	public boolean autentica(String senha) {
		if(senha == this.senha) {
			return true;
		}
		
		return false;
	}

}
