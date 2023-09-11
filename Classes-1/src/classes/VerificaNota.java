package classes;

public class VerificaNota {
    public static void main(String[] args) {
        int mediaFinal = 5;
        if (mediaFinal < 6)
            System.out.println("Reprovado");
        else if (mediaFinal > 5)
            System.out.println("Aprovado");
        else
            System.out.println("Prova Minerva");
    }
}
