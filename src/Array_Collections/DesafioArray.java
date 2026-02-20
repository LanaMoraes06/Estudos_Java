package Array_Collections;

import java.util.Scanner;

public class DesafioArray {
    static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a quantidade de notas que deseja guardar: \n");
        int qtdNotas = leitor.nextInt();

        double[] notas = new double[qtdNotas];
        double totalNotas = 0;
        for (int i = 0; i < qtdNotas; i++){
            System.out.println("\nDigite a " + (i + 1) + "a nota: ");
            notas[i] = leitor.nextInt();
        }
        for (double nota : notas){
            totalNotas += nota;
        }
        System.out.println("\n A media é " + totalNotas / notas.length);

        leitor.close();
    }
}
