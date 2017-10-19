
public class Engenheiro extends Funcionario {

	@Override
	public double getBonificacao() {
		return this.salario * 0.12;
	}

}
