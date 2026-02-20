package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    static void main(String[] args) {
        Consumer<Produto> imprimir =
                p -> System.out.println(p.nome + "!!!");

        Produto p1 = new Produto("Arroz", 33.90, 0.15);
        imprimir.accept(p1);
        Produto p2 = new Produto("Feijão", 24.90, 0.15);
        Produto p3 = new Produto("Macarrão", 9.99, 0.15);
        Produto p4 = new Produto("Farinha", 4.90, 0.15);
        Produto p5 = new Produto("Sabonete", 3.90, 0.15);


        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
        produtos.forEach(imprimir);
        produtos.forEach(p -> System.out.println(p.preco));
        produtos.forEach(System.out:: println);
    }

}
