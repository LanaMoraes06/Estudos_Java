package Colecoes;

import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
    static void main(String[] args) {
        //HashSet listaAprovados = new HashSet<String>();//Não ordenado
        TreeSet listaAprovados = new TreeSet<String>(); //tem alguma ordem de inserção
        listaAprovados.add("Gusthavo");
        listaAprovados.add("Lana");
        listaAprovados.add("Thovaguh");
        listaAprovados.add("CherryMoti0n");

        for (Object candidato : listaAprovados){
            System.out.println(candidato);

        }
        HashSet<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);

    }
}
