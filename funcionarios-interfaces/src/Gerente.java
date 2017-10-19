
public class Gerente extends Funcionario implements Autenticavel {

	private String senha;
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getSenha() {
		return senha;
	}
	
	@Override
	public boolean autentica(String senha) {
		if(senha == this.senha) {
			return true;
		}
		
		return false;
	}
	
	@Override
	public double getBonificacao() {
		return 5000;
	}
}
