package oo.composicao.desafioModulo;

public class Main {

    static void main(String[] args) {
        Conteudo codigo1111 = new Serie("Bridgerton", 2017, 4, 9, 120);
        Conteudo codigo1112 = new Serie("The 100", 2010, 3, 12, 40);

        System.out.println(codigo1111.calcularTempo());
        System.out.println(codigo1112.calcularTempo());


    }
}
