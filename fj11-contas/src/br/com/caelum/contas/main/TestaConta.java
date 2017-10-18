package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;

public class TestaConta {

	public static void main(String[] args) {

		Conta conta = new Conta();
		conta.setTitular("Jeferson");
		conta.setNumero(123);
		conta.deposita(500.5);
		conta.saca(300.6);

		System.out.println(conta.getSaldo());
	}
}
