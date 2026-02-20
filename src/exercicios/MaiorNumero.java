package exercicios;

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int maior = 0;

        for (int i = 0; i < 10; i++){
            System.out.println("\nDigite o " + (i+1) + " numero: ");
            int num = leitor.nextInt();

            if (num > maior){
                maior = num;
            }
        }
        System.out.println("\nO maior numero é " + maior);
    }
}
