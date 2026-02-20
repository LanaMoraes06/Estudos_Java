package Colecoes;

import java.util.ArrayList;

public class Lista {
    static void main(String[] args) {
        ArrayList<Usuario> lista  = new ArrayList<>();

        Usuario u1 = new Usuario("Gusthavo");
        lista.add(u1);
        lista.add(new Usuario("Thovaguh"));
        lista.add(new Usuario("Lana"));
        lista.add(new Usuario("Bibi"));
        lista.add(new Usuario("Ana"));

        System.out.println(lista.get(1).nome); //O 1 é o numero indexado

        for (Usuario user: lista){
            System.out.println(user.nome);
        }
    }
}
