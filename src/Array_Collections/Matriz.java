package Array_Collections;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("\n|Digite a quantidade de alunos: ");
        int qtdAlunos = leitor.nextInt();

        System.out.println("\n|Digite a quantidade de notas: ");
        int qtdNotas = leitor.nextInt();

        double total = 0;
        double[][] notasAlunos = new double[qtdAlunos][qtdNotas];
        for (int i =0; i < notasAlunos.length; i++){
            for (int j = 0; j < notasAlunos.length; j++){
                System.out.println("Informe a nota do aluno a " + (j + 1) + "a nota do aluno " + (i + 1) + ": ");
                notasAlunos[i][j] = leitor.nextInt();
                total += notasAlunos[i][j];
            }
        }
        for(double[] notasDoALuno : notasAlunos){
            System.out.println(Arrays.toString(notasDoALuno));
        }


        leitor.close();
    }

}
