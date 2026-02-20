package oo.composicao.heranca.desafio.teste;

import oo.composicao.heranca.Direcao;
import oo.composicao.heranca.Heroi;
import oo.composicao.heranca.Monstro;

public class Jogo {
    static void main(String[] args) {
        Heroi heroi = new Heroi(10, 11);

        Monstro monstro = new Monstro();

        System.out.println("Monstro tem => " + monstro.vida);
        System.out.println("Heroi tem => " + heroi.vida);

        heroi.atacar(monstro);
        monstro.atacar(heroi);

        System.out.println("Monstro tem => " + monstro.vida);
        System.out.println("Heroi tem => " + heroi.vida);
        heroi.atacar(monstro);
        monstro.atacar(heroi);
        System.out.println("Monstro tem => " + monstro.vida);
        System.out.println("Heroi tem => " + heroi.vida);

        monstro.andar(Direcao.NORTE);
        heroi.atacar(monstro);
        monstro.atacar(heroi);
        System.out.println("Monstro tem => " + monstro.vida);
        System.out.println("Heroi tem => " + heroi.vida);
    }
}
