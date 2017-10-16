class Academia {

    public static void main(String[] args) {

        String nome = "Jeferson";
        int idade = 17;
        float peso = 75.5F;
        double altura = 1.7;
        char sexo = 'M';
        boolean ehFumante = false;
        boolean amigoDoDono = false;

        if(idade >= 18 || amigoDoDono) {
            System.out.println("Pode se matricular");
        } else {
            System.out.println("Não pode se matricular!");
        }

        for(int i = 0; i < 3; i++) {
            peso++;
        }

        // System.out.println(i);

        //while e comentario de bloco
        /* while(idade < 18) {
            System.out.println("Volte ano que vem");
            idade++;
        }*/

        int num = 10;
        double numDecimal = 100.5;
        int numDeVolta = (int) numDecimal;
    }
}
