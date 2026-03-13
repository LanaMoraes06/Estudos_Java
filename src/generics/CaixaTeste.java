package generics;

public class CaixaTeste {
    static void main(String[] args) {

        Caixa<String> caixaA = new Caixa();
        caixaA.setGuardar("Segredo..");

        System.out.println(caixaA.abrir());
    }
}
