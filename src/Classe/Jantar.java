package Classe;

public class Jantar {
    static void main(String[] args) {

        Pessoa p1 = new Pessoa("Gusthavo", 88);
        Comida c1 = new Comida("Ovo", 1);
        Comida c2 = new Comida("Frango", 1);

        System.out.println(p1.nomePessoa);
        System.out.println(p1.pesoPessoa);

        System.out.println(p1.apresentacao());
        p1.Comer(c1);
        System.out.println(p1.apresentacao());

    }
}
