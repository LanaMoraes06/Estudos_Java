package lambdas;

import java.math.BigDecimal;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;


public class Desafio {
    static void main(String[] args) {
        Produto p = new Produto("iPad", 3235.89, 0.13);

        Function<Produto, Double> calcularPrecoFinal = s -> s.getPreco() - p.getDesconto();

        Function<Double, Double> calcularImposto = valor -> valor >= 2500 ? valor * 1.085 : valor;


        Function<Double, Double> calcularFrete = valor -> valor >= 3000 ? valor + 100.00 : valor + 50.0;

        Function<Double, String> formatar =
                valor -> String.format("R$ %.2f", valor);

        String resultadoFinal = calcularPrecoFinal.andThen(calcularFrete).andThen(calcularImposto).andThen(formatar).apply(p);

        System.out.println(resultadoFinal);
    }
}

