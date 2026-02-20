package oo.composicao.heranca.desafio;

public class Carro {
    public int velocidadeAtual;
    final int VELOCIDADE_MAXIMA;
    private int delta = 5;

    Carro(int velocidadeMaxima) {
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    public void acelerar(){
        if (velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA){
        velocidadeAtual = VELOCIDADE_MAXIMA;
    }else{
            velocidadeAtual += getDelta();
        }
     }
    public void frear(){
        if (velocidadeAtual > 0){
            velocidadeAtual -= delta;
        }
        else {
            velocidadeAtual = 0;
        }

    }

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }
}
