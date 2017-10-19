
public class Secretario extends Funcionario {

	private String telefone;
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public double getBonificacao() {
		return this.salario * 0.08;
	}
}
