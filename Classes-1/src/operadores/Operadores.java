package operadores;

public class Operadores {
    public static void main(String[] args) {
        //Soma, Subtração, Multiplicação, Divisão, Módulo, Concatenação
        int soma = 10 + 4;
        int subtração = 10 - 4;
        int multiplicacao = 10 * 4;
        double divisao = 10 / 4;
        int modulo = 10 % 4;
        String nomeCompleto = "Paulo" + "Brandino";


        int numero = 5;
        System.out.println(- numero);
        System.out.println(+ numero);

        boolean isValid = true;
        System.out.println(!isValid);

        numero ++;
        System.out.println(numero);

        numero --;
        System.out.println(numero);

        System.out.println(++ numero);
        System.out.println(-- numero);

        //Ternário
        int a, b;

        a = 5;
        b = 10;

        int resultado =  a == b ? 1 : 0;
        System.out.println(resultado);

        //Relacionais
        boolean isTrueOrFalse = a == b;
        System.out.println(isTrueOrFalse);

        isTrueOrFalse = a != b;
        System.out.println(isTrueOrFalse);

        isTrueOrFalse = a > b;
        System.out.println(isTrueOrFalse);

        isTrueOrFalse = a < b;
        System.out.println(isTrueOrFalse);

        //Lógicos
        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2) {
            System.out.println("Verdadeiras");
        }
        
        if (condicao1 || condicao2) {
            System.out.println("Uma das condições é verdadeira");
        }
    }
}
