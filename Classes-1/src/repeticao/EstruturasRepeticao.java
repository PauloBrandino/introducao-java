package repeticao;

public class EstruturasRepeticao {

    //for simples
    public void contadorCarneirinhos() {
        for (int carneirinhos = 1; carneirinhos <= 20; carneirinhos ++){
            System.out.println("Contatando carneirinhos" + carneirinhos);
        }
    }

    //for em array
    public void imprimeAluno() {
        String alunos [] = { "Paulo", "Lorena", "Tiago", "Tais" };

        for (int i=0; i < alunos.length; i++) {
            System.out.println(alunos[i]);
        }
    }

}
