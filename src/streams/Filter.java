package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
    static void main(String[] args) {
        Aluno a1 = new Aluno("Ana", 7.8, false);
        Aluno a2 = new Aluno("Lana", 10.0, true);
        Aluno a3 = new Aluno("Gusthavo", 3.4, false);
        Aluno a4 = new Aluno("Marcos", 3.1, true);
        Aluno a5 = new Aluno("Arthur", 4.7, true);
        Aluno a6 = new Aluno("Giovanna", 8.8, true);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
        Predicate<Aluno> aprovado = a -> a.nota >= 7;
        Function<Aluno, String> saudacaoAprovado = aluno -> "Parabéns " + aluno.nome + " você foi aprovado(a)!";
        alunos.stream().filter(aprovado).map(saudacaoAprovado).forEach(System.out::println);
    }
}
