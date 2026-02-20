package Colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();


        //ADICIONA ELEMENTOS NA FILA
        //DIFERENÇA OCORRE QUANDO A LISTA ESTÁ CHEIA
        fila.add("Gusthavo");  //o add lançará uma exceção caso a fila esteja cheia.
        fila.offer("Lanoca"); // retorna falso caso a fila esteja cheia
        fila.offer("Rafa");
        fila.offer("Ana");


        //OBTEM ELEMENTOS DA FILA SEM OBTER
        //DIFERENÇA OCORRE QUANDO A LISTA ESTÁ VAZIA
        System.out.println(fila.peek()); // ele pega um item da lista e se não tiver retorna null
        System.out.println(fila.element()); // lançará excecão

        System.out.println(fila.poll()); // retorna o primeiro elemento da lista já removendo, lança null
        System.out.println(fila.remove()); // lança uma exceção


    }
}
