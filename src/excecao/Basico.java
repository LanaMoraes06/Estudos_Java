package excecao;

public class Basico {
    static void main(String[] args) {
        Aluno a1 = null;

        try {
            imprimirNomeDoAluno(a1);
        } catch (Exception e) {
            System.out.println("Ocorreu um erro no momento de imprimir o usuário");
        }

        try {
            System.out.println(7 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Ocorreu um erro " + e.getMessage());
        }
        System.out.println("fim <3");
    }


    private static void imprimirNomeDoAluno(Aluno aluno) {
        System.out.println(aluno.nome);
    }
}
