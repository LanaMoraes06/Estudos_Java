package oo.composicao.polimorfismo;

public class Comer {
    static void main(String[] args) {

        Pessoa convidado = new Pessoa(88.09);

        Arroz ingrediente1 = new Arroz(0.100);
        Feijao ingrediente2 = new Feijao(0.500);
        Comida ingrediente3 = new Carne(0.800);
        Sorvete ingrediente4 = new Sorvete(0.150);

        System.out.println(convidado.getPeso());
        convidado.comer(ingrediente1);
        convidado.comer(ingrediente2);
        convidado.comer(ingrediente3);
        convidado.comer(ingrediente4);

        System.out.println(convidado.getPeso());

    }
}
