package Colecoes;

import java.util.HashSet;

public class ConjuntoBaguncado {
    static void main(String[] args) {
        HashSet conjunto = new HashSet();

        conjunto.add(1.2); //vai converter o double pra Double, conversão automatica para variaveis primitivas
        conjunto.add(true);
        conjunto.add("Gusthavo");
        conjunto.add(1);
        conjunto.add('x');

        System.out.println("O tamanho é " + conjunto.size()); // o tamanho do conjunto
        System.out.println(conjunto.remove("Gusthavo")); //vai retornar verdadeiro ou falso
        System.out.println(conjunto.contains("Gusthavo")); // vai ver se contem o "Gusthavo" no conjunto
    }
}
