package generics;

public class CaixaNumeroTeste {

    static void main(String[] args) {
        CaixaNumero<Double> caixaA = new CaixaNumero<>();
        caixaA.setGuardar(3.3);

        System.out.println(caixaA.abrir());

    }
}
