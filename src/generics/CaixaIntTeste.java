package generics;

public class CaixaIntTeste {
    static void main(String[] args) {
        CaixaInt caixaA = new CaixaInt();
        caixaA.setGuardar(123);

        Integer coisaA = caixaA.abrir();

        System.out.println(coisaA);
    }
}
