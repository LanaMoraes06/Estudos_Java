package Classe;

public class DataTeste {
    static void main(String[] args) {

        Data data1 = new Data();
        data1.ano = 2021;

        var data2 = new Data(06, 11, 2006);

        String dataFormatada1 = data1.dataFormatada();

        System.out.println(dataFormatada1);
        System.out.println(data2.dataFormatada());

        data1.imprimirDataFormatada();
        data2.imprimirDataFormatada();
    }
}
