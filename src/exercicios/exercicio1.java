package exercicios;

import java.util.Scanner;

public class exercicio1 {
    static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("\nDigite um número");
        int num = leitor.nextInt();
        int anterior = num-1;
        int atual = 0;


        for (int i = 0; i < 5; i++){
            atual = anterior + num;
            anterior = atual;
            System.out.println("\n" + anterior);
        }
        leitor.close();
    }
}
