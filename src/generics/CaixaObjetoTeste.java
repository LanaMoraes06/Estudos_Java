package generics;

public class CaixaObjetoTeste {
    static void main(String[] args) {
        CaixaObjeto caixaA = new CaixaObjeto();
        caixaA.abrir();

        Double coisaA = (Double) caixaA.abrir() ;
        System.out.println(coisaA);
    }
}
