package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
    static void main(String[] args) {

        Consumer<String> print = System.out::println;

        Stream<String> lengs = Stream.of("Java ", "Lua ", "Python\n");

        String[] maisLangs = {"Go", "React ", "Lisp ", "C++\n" };

        Stream.of(maisLangs).forEach(print);
        Arrays.stream(maisLangs).forEach(print);
        Arrays.stream(maisLangs, 1, 4).forEach(print);
        List<String> outrasLangs = Arrays.asList("C ", "Kotlin ", "Javascript\n");
        outrasLangs.forEach(print);
    }
}
