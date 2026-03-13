package generics;

public class ParesTeste {
    static void main(String[] args) {

        Pares<Integer, String> resultadoConcurso = new Pares<>();


        resultadoConcurso.adicionar(1, "Ana");
        resultadoConcurso.adicionar(2, "Paola");
        resultadoConcurso.adicionar(3, "Nana");
        resultadoConcurso.adicionar(4, "Giovana");
        resultadoConcurso.adicionar(5, "Lana");

        System.out.println(resultadoConcurso.getValor(1));
    }
}
