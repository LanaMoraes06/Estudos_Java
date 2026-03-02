package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
    static void main(String[] args) {

         Funcionario f1 = new Funcionario("Juliana", 1500.0, false);
         Funcionario f2 = new Funcionario("Arthur", 2500.0, true);
         Funcionario f3 = new Funcionario("Lucas", 3500.0, true);
         Funcionario f4 = new Funcionario("Bento", 100.0, false);
         Funcionario f5 = new Funcionario("Rayssa", 500.0, false);
         Funcionario f6 = new Funcionario("Lana", 870.0, true);

        List<Funcionario> funcionarios =  Arrays.asList(f1, f2, f3, f4, f5, f6);
        Predicate<Funcionario> faturamento = m -> m.faturamento >= 1000;
        Predicate<Funcionario> atingiuMeta = m -> m.meta;
        Function<Funcionario, String> aumentoSalario = m -> "Parabéns " + m.nome + " você ganhou aumento salarial!";

        funcionarios.stream().filter(faturamento).filter(atingiuMeta).map(aumentoSalario).forEach(System.out::println);


    }
}
