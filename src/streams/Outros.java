package streams;

import java.util.Arrays;
import java.util.List;

public class Outros {
    static void main(String[] args) {
        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Lana", 9.1);
        Aluno a3 = new Aluno("Maria", 8.1);
        Aluno a4 = new Aluno("Gui", 10.0);
        Aluno a5 = new Aluno("Julia", 4.1);
        Aluno a6 = new Aluno("Mulan", 7.5);
        Aluno a7 = new Aluno("Begosso", 9.9);
        Aluno a8 = new Aluno("Gui", 10.0);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);

        System.out.println("Distinct...");
        alunos.stream().distinct().forEach(System.out::println);

        System.out.println("\nSkip/Limit");
        alunos.stream().skip(2).limit(2).forEach(System.out::println);

        System.out.println("\nTakeWhile");
        alunos.stream().skip(2).takeWhile(a->a.nota >= 7).forEach(System.out::println);

    }
}
