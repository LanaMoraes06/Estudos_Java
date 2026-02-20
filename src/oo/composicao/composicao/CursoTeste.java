package oo.composicao.composicao;

public class CursoTeste {
    static void main(String[] args) {
        Aluno a1 = new Aluno("Gusthavo");
        Aluno a2 = new Aluno("Lana");
        Aluno a3 = new Aluno("Miguel");

        Curso c1 = new Curso("JavaFx");
        Curso c2 = new Curso("Kali Linux");
        Curso c3 = new Curso("Figma");

        c1.adicionarAluno(a1);
        c3.adicionarAluno(a2);
        c2.adicionarAluno(a3);

        a1.adicionarCurso(c3);
        a2.adicionarCurso(c3);
        a3.adicionarCurso(c3);

        for(Aluno aluno : c3.alunos){
            System.out.println("Estou matriculado no curso " + c2.nome + "...");
            System.out.println("... meu nome é " + aluno.nome);
            System.out.println();
        }
    }
}
