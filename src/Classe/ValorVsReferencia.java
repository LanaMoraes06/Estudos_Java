package Classe;

public class ValorVsReferencia {
    public static void main(String[] args) {
        double a = 2;
        double b =a;

        a++;
        b--;
        System.out.println(a + " " + b);

        Data d1 = new Data(1, 2, 2022);
        Data d2 = d1;

        System.out.println(d1.dataFormatada());
        System.out.println(d2.dataFormatada());

        int c = 5;
        voltarDataParaValorPadrao(d1);
        alterarPrimitivo(c);
        System.out.println(c);
    }
    static void voltarDataParaValorPadrao(Data d){
        d.dia = 4;
        d.mes = 3;
        d.ano = 2007;

    }
    static void alterarPrimitivo(int a){
        a++;
    }
}
