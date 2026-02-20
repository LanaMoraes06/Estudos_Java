package exercicios;

import java.util.Scanner;

public class DesafioCalculadora {
    static Scanner leitor = new Scanner(System.in);
    public static void main(String[] args) {


        int escolhaUsuario = 0;
        while (escolhaUsuario != 5){
            System.out.println("-------Seja bem vindo!----");
            System.out.println("1 - SOMA");
            System.out.println("2 - SUBTRAÇÃO");
            System.out.println("3 - MULTIPLICAÇÃO");
            System.out.println("4 - DIVISÃO");
            System.out.println("5 - SAIR");
            System.out.println("---Digite uma opção---\n");
            escolhaUsuario = leitor.nextInt();
            leitor.nextLine();

            switch (escolhaUsuario){

                case 1:
                    sumNum();
                    break;
                case 2:
                    subtractionNum();
                    break;
                case 3:
                    multNum();
                    break;
                case 4:
                    divisionNum();
                    break;
                case 5:
                    System.out.println("\nObrigada por usar o programa, até a próxima!");
                    break;
            }
        }


    }




    private static void divisionNum() {
        System.out.println("Digite o primeiro número: ");
        int num1 = leitor.nextInt();
        System.out.println("Digite o segundo número");
        int num2 = leitor.nextInt();
        System.out.println("\n" + num1 + " / " + num2 + " = " + (num1/num2));
    }

    private static void multNum() {
        System.out.println("Digite o primeiro número: ");
        int num1 = leitor.nextInt();
        System.out.println("Digite o segundo número");
        int num2 = leitor.nextInt();
        System.out.println("\n" + num1 + " x " + num2 + " = " + (num1*num2));
    }

    private static void subtractionNum() {
        System.out.println("Digite o primeiro número: ");
        int num1 = leitor.nextInt();
        System.out.println("Digite o segundo número");
        int num2 = leitor.nextInt();
        System.out.println("\n" + num1 + " - " + num2 + " = " + (num1-num2));
    }

    private static void sumNum() {
        System.out.println("Digite o primeiro número: ");
        int num1 = leitor.nextInt();
        System.out.println("Digite o segundo número");
        int num2 = leitor.nextInt();
        System.out.println("\n" + num1 + " + " + num2 + " = " + (num1+num2));

    }
}
