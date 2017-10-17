class TestaConta {

    public static void main(String[] args) {

        Conta c1 = new Conta();
        c1.setTitular("Jef");
        c1.deposita(500);
        c1.setNumero(123);
        // c1.saldo = c1.saldo - 1000;

        double valor = 10000;
        c1.saca(valor);
        c1.saca(100000000);

        System.out.println(c1.getNumero());
    }
}
