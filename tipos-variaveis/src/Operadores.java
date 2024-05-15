public class Operadores {

    public static void main(String[] args) {
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println(nomeCompleto);

        //qual o resultado das expressoes abaixo?
        String concatenacao ="?"; 
        System.out.println(concatenacao);

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);
        
        int numero = 5;

        System.out.println(numero);

        numero = - numero;

        System.out.println(numero);

        numero = - numero;

        System.out.println(numero);

        String nome1 = "ANTONIO";
        String nome2 = new String("ANTONIO");

        if (nome1 == nome2) {
            System.out.println("Textos são iguais com igual");
        } else {
            System.out.println("Textos não são iguais com igual");
        }

        if (nome1.equals(nome2)) {
            System.out.println("Textos são iguais com equals");
        } else {
            System.out.println("Textos não são iguais com equals");
        }
    }
    
}
