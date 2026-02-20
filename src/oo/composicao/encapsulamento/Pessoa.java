package oo.composicao.encapsulamento;

public class Pessoa {
    private int idade;

    public Pessoa(int idade){
        setIdade(idade);
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int novaIdade){
        novaIdade = Math.abs(novaIdade);
        if (idade >= 0 && novaIdade <= 120){
            this.idade = novaIdade;
        }
    }
}
