package Classe;

public class ProdutoTeste {
    static void main(String[] args) {
        Produto p1 = new Produto("Notebook", 1600.99);

        Produto p2 = new Produto("AirFry", 800.99);


        System.out.println(p1.nome);
        System.out.println(p2.nome);

        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto(0.1);
        double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;

        System.out.println("A média do carrinho é " + mediaCarrinho);
    }
}
