class Exercicio2 {

    public static void main(String[] args) {

        // 1 + 2 + 3 + 4 + 5 ... 1000

        int soma = 0;
        for(int i = 1; i <= 1000; i++) {
            // soma = soma + i;
            soma += i;
        }

        System.out.println("Soma: " + soma);
    }
}
