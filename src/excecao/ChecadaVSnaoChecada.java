package excecao;

public class ChecadaVSnaoChecada {
    static void main(String[] args) throws Exception {

        try {
            geraErro1();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        try {
            geraErro2();
        } catch (Throwable e) {
            System.out.println(e.getMessage());

        }
    }

    static void geraErro2() throws Exception {
        throw new RuntimeException("Ocorreu um erro bem legal! 2<3");
    }

    static void geraErro1() {
        throw new RuntimeException("Ocorreu um erro bem legal! 1<3");
    }
}
