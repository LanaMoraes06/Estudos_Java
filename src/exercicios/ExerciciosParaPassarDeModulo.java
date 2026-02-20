package exercicios;

import java.time.Year;
import java.util.Scanner;

public class ExerciciosParaPassarDeModulo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("\nDigite o ano: ");
        int ano = leitor.nextInt();

        if(Year.isLeap(ano)){ // muito daora, ele pega o ano como pparametro e o isLeappara verificar se o ano é bissexto
            System.out.println("\nO ano é bissexto!");
        }else{
            System.out.println("\nNão é bissexto");
        }

        leitor.close();
    }
}
