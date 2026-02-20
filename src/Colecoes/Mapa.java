package Colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa { //Estrura chave/valor
    static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<>();
        usuarios.put(1, "Thovaguh"); //É o metodo adicionar, não tem add no map
        usuarios.put(20, "Lanoca");
        usuarios.put(3, "Recesso");



        System.out.println(usuarios.keySet()); // Vai retornar o conjunto das chaves,[1, 20, 3]
        System.out.println(usuarios.values()); //ele vai repassar apenas os valores, nesse caso, os nomes
        System.out.println(usuarios.entrySet()); //Valores e as chaves ao mesmo tempo


    }
}
