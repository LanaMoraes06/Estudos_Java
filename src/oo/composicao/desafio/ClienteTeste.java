package oo.composicao.desafio;

public class ClienteTeste {
    static void main(String[] args) {


        Cliente cliente1 = new Cliente("Gusthavo");
        Compra compra1 = new Compra();
        compra1.adicionarItem("Arroz", 99, 4);
        compra1.adicionarItem(new Produto("Feijao", 699), 2);

        Compra compra2 = new Compra();
        compra2.adicionarItem("Carne", 99, 4);
        compra2.adicionarItem(new Produto("Queijo", 699), 2);

        cliente1.compras.add(compra1);
        cliente1.compras.add(compra2);

        System.out.println(cliente1.obterValorTotal());
    }
}
