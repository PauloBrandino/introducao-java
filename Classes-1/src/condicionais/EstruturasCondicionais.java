package condicionais;

public class EstruturasCondicionais {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 17.0;

        //Condicional Simples
        if(valorSolicitado <= saldo) {
            saldo -= valorSolicitado;
        }

        System.out.println(saldo);
    }

    //Condicional Composta
    public void verificaNota() {
        int nota = 6;

        if(nota >= 7){
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }

    //Condicional Encadeada
    public void verificaNotaEncadeada() {
        int nota = 6;    
        if(nota >= 7)
            System.out.println("Aprovado");
        else if(nota >= 5 && nota < 7)
            System.out.println("Recuperação");
        else
            System.out.println("Reprovado");
    }

    //Condicional Ternária
    public void verificaNotaTernaria(){
        int nota = 6;

        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";

        System.out.println(resultado);
    }

    //Switch Case
    public void sistemaMedidas() {
        String sigla = "M";

        switch (sigla) {
            case "P":
                System.out.println("Pequeno");
                break;
            case "M":
                System.out.println("Médio");
                break;
            default:
                System.out.println("Grande");
                break;
        }
    }
}
