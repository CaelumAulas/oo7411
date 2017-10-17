class TestaConta {

    public static void main(String[] args) {

        Titular t1 = new Titular();
        t1.nome = "Jeferson";
        t1.cpf = "393.456.908-09";

        Conta c1 = new Conta();
        c1.cliente = t1;
        c1.saldo = 500;
        c1.numero = 123;
        c1.agencia = "267-09";
        c1.dataDeAbertura = "01/02/2017";
        c1.cliente.nome = "Silva";

        System.out.println(t1.nome);
    }
}
