package streams;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
    static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Ana", "Lu", "Gui", "Soler");

        System.out.println("Usando o for");
        for (int i = 0; i < aprovados.size(); i++){
            System.out.println(aprovados.get(i));
        }

        System.out.println("Usando o foreach");
        for(String nome : aprovados){
            System.out.println(nome);
        }
        System.out.println("\nUsando o iterator");
        Iterator<String> it = aprovados.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("\nUsando Stram...");
        Stream<String> stream = aprovados.stream();
        stream.forEach(System.out::println);

    }
}
