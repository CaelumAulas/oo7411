class Conta {

    private String titular;
    private double saldo;
    private int numero;

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        // validacao titular
        this.titular = titular;
    }

    public void deposita(double valor) {
        // saldo = saldo + valor
        saldo += valor;
    }

    public void saca(double valor) {
        if(valor <= saldo) {
            saldo = saldo - valor;
        }
    }

    public double calculaRendimento() {
        return this.saldo * 0.1;
    }
}
