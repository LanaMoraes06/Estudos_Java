package oo.composicao.composicao;

public class CompraTeste {
    static void main(String[] args) {
        Compra c1 = new Compra();
        c1.cliente = "Gusthavo";
        c1.adicionarItem(new Item("Caneta", 2, 3));
        c1.adicionarItem(new Item("Ovos", 30, 40));
        c1.adicionarItem(new Item("Lanche", 1, 0));

        System.out.println(c1.itens.size());
        System.out.println(c1.obterValorTotal());
    }
}
