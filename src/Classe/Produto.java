package Classe;

public class Produto {
    String nome;
    double preco;
    final static double desconto = 0.5;


    Produto(String nomeInicial, double precoInicial){
        nome = nomeInicial;
        preco = precoInicial;

    }
    double precoComDesconto(){
        return preco * (1 - desconto);
    }
    double precoComDesconto(double descontoDoGerente){
        return preco * (1 - desconto + descontoDoGerente);
    }
}
