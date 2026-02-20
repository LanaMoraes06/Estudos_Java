package Classe;

public class Pessoa {

    String nomePessoa;
    double pesoPessoa;
//    metodo comer recebe como parametro outro objeto da classe comida



    Pessoa(String nomePessoa, double pesoPessoa){
        this.nomePessoa = nomePessoa;
        this.pesoPessoa = pesoPessoa;
    }
    void Comer(Comida comida){
        if (comida !=null){
            this.pesoPessoa += comida.pesoComida;

        }
    }
    String apresentacao(){
        return "Eu sou o amor da Lana, vulgo " + nomePessoa + "e tenho " + pesoPessoa + "Kgs.";
    }
}
