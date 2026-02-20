package Array_Collections;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Exercicio {
     static void main(String[] args) {
    double notasAlunoA[] = new double[4];
    System.out.println(Arrays.toString(notasAlunoA));
    notasAlunoA[0] = 7.9;
    notasAlunoA[1] = 9;
    notasAlunoA[2] = 6.8;
    notasAlunoA[3] = 6.0;
    System.out.println(Arrays.toString(notasAlunoA));

    double totalAlunoA = 0;
    for (int i = 0; i < notasAlunoA.length; i++){ //lenght é pra percorrer todo array, ele pega o tamanho praticamente
        totalAlunoA += notasAlunoA[i];
    }
         System.out.println(totalAlunoA / notasAlunoA.length);

    //Outro jeito de fazer o array, menos usado, normalmente usando com dados definidos
    double totalAlunosB = 0;
    double[] notasAlunoB = {8.8, 7.7, 6.7, 5.5};
    for(int i = 0; i < notasAlunoB.length; i++){
        totalAlunosB += notasAlunoB[i];
    }
         System.out.println( totalAlunosB / notasAlunoB.length);
}
}