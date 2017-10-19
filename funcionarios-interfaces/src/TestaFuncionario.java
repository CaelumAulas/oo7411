
public class TestaFuncionario {

	public static void main(String[] args) {
	
		Funcionario joao = new Engenheiro();
		joao.setNome("Joao");
		joao.setSalario(1000);
		joao.getBonificacao();
		
		Gerente jose = new Gerente();
		jose.setNome("Jose");
		jose.setSalario(15000);
		jose.setSenha("687k");
		
		Secretario flavio = new Secretario();
		flavio.setNome("Flavio");
		flavio.setSalario(20000);
		
		CB cb = new CB();
		cb.adiciona(joao);
		cb.adiciona(jose);
		cb.adiciona(flavio);
		
		SistemaInterno si = new SistemaInterno();
		si.login(jose);
		si.login(diretor);
		si.login(cliente);
		
		Autenticavel a = new Cliente();
		a.autentica("34");
	}
}
