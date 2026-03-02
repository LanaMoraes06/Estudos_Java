package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {
    static void main(String[] args) {
        Consumer<String> print = System.out::println;
        List<String> marcas = Arrays.asList("BMW ", "Uno", "Peugeot");


        marcas.stream().map(m -> m.toUpperCase()).forEach(print);



        marcas.stream().map(Utilitarios.maiuscula).map(Utilitarios.primeiraLetra).map(Utilitarios::grito).forEach(print);
    }
}
