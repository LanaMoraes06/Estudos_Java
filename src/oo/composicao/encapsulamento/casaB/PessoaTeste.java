package oo.composicao.encapsulamento.casaB;

import oo.composicao.encapsulamento.Pessoa;

public class PessoaTeste {
    static void main(String[] args) {
        Pessoa p1 = new Pessoa(30);
        //p1.idade = 20;
        p1.setIdade(20);

        System.out.println(p1.getIdade());
    }
}
