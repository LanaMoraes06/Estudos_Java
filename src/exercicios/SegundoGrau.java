package exercicios;

import java.util.Scanner;

public class SegundoGrau {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Vamos calcular essa equação de segundo grau?");
        System.out.println("Digite o A: ");
        double a = leitor.nextDouble();
        System.out.println("\nDigite o B: ");
        double b = leitor.nextDouble();
        System.out.println("\nDigite o C: ");
        double c = leitor.nextDouble();

        double delta = 0;
        delta = Math.sqrt((b * b) - 4 * a * c);
        if (delta < 0){
            System.out.println("Não é possivel realizar a conta com o delta negativo");
        }
        else{
            System.out.println("\nO x1 é " + ((b * (-1)) + delta)/(2*a));
            System.out.println("\nO x2 é " + ((b * (-1)) - delta)/(2*a));
        }

    }
}
