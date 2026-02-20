package oo.composicao.composicao;

public class Carro {

    Motor motor = new Motor();

    void acelerar(){
        motor.fatorInjecao += 0.4;
    }
    void frear(){
        motor.fatorInjecao -= 0.4;
    }
    void ligar(){
        motor.ligado = true;
    }
    void desligado(){
        motor.ligado = false;
    }
    boolean estaLigado(){
        return motor.ligado;
    }
}
