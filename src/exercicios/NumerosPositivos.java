package exercicios;

import java.util.Scanner;

public class NumerosPositivos {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int escolhaUsuario = 0;
        int i = 0;
        int soma = 0;
                while (true){
                    System.out.println("\nDigite um número: ");
                    int num = leitor.nextInt();
                    if (num < 0){
                        System.out.println("Não aceitamos numeros negativos");
                        break;

                }else{
                        soma += num;
                        System.out.println("A soma por enquanto ta assim: " + soma);
                        i++;
                    }}


        leitor.close();
    }
}
