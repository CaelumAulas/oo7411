class Conta {

    Titular cliente;
    Titular funcionario;

    double saldo;
    int numero;
    String agencia;
    String dataDeAbertura;

    void deposita(double valor) {
        // saldo = saldo + valor
        saldo += valor;
    }

    void saca(double valor) {
        saldo = saldo - valor;
    }

    double calculaRendimento() {
        return this.saldo * 0.1;
    }
}
