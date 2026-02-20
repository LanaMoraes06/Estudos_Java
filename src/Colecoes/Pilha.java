package Colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha { //LIFO
    static void main(String[] args) {

        Deque<String> pilha = new ArrayDeque<>();


        pilha.add("O pequeno principe"); //ele retorna um valor booleano
        pilha.push("The subway"); // ele não retorna nada além de uma excecão
    }
}
