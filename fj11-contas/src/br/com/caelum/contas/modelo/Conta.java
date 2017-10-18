package br.com.caelum.contas.modelo;

/**
 * Classe que representa as contas do sistema
 * 
 * @author Lucas Felix
 * 
 */
public class Conta {

	private String agencia;
	private int numero;
	private String titular;
	private double saldo;
	private String dataDeAbertura;

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getDataDeAbertura() {
		return dataDeAbertura;
	}

	public void setDataDeAbertura(String dataDeAbertura) {
		this.dataDeAbertura = dataDeAbertura;
	}

	/**
	 * 
	 * @return O valor do saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Metodo que incrementa o saldo da conta
	 * 
	 * @param valor O valor a ser depositado
	 * 
	 */
	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}

	public void saca(double valor) {
		if (valor <= this.saldo) {
			this.saldo = this.saldo - valor;
		}
	}
}
