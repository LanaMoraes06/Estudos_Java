package oo.composicao.heranca.desafio.teste;

import oo.composicao.heranca.desafio.Carro;
import oo.composicao.heranca.desafio.Peugeot;
import oo.composicao.heranca.desafio.Uno;

public class CarroTeste {
    static void main(String[] args) {
        Uno uno = new Uno(300);
        Peugeot peugeot = new Peugeot(200);

        System.out.println("Velocidade do Uno: " + uno.velocidadeAtual);
        uno.acelerar();
        System.out.println("Velocidade do Peugeot: " + peugeot.velocidadeAtual);
        peugeot.acelerar();
        System.out.println("Velocidade do Uno: " + uno.velocidadeAtual);
        uno.acelerar();
        uno.ligarTurbo();
        System.out.println("Velocidade do Peugeot: " + peugeot.velocidadeAtual);
        peugeot.acelerar();
        System.out.println("Velocidade do Uno: " + uno.velocidadeAtual);
        uno.acelerar();
        System.out.println("Velocidade do Peugeot: " + peugeot.velocidadeAtual);
        peugeot.acelerar();
        System.out.println("Velocidade do Peugeot: " + peugeot.velocidadeAtual);
        System.out.println("Velocidade do Uno: " + uno.velocidadeAtual);
        peugeot.acelerar();
        peugeot.acelerar();
        peugeot.acelerar();
        peugeot.acelerar();
        System.out.println("Velocidade do Peugeot: " + peugeot.velocidadeAtual);
        System.out.println("Velocidade uno " + uno.velocidadeAtual);
    }
}
