package exercicios;

import java.util.Scanner;

public class JoguinhoDeAdvinharONumero {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("\nBem vindo ao joguinho! ");

        int numCerto = 2;

        for(int i = 10; i >=0; i--){
            System.out.println("Digite um número de 0-100:");
            int num = leitor.nextInt();
            if (num == numCerto){
                System.out.println("Você ganhou, parabens!");
                    break;

            }else{
                System.out.println("Você errou, voce tem " + i + " tentativas");
            }

        }





        leitor.close();
    }
}
