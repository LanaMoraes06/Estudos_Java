package oo.composicao.desafioModulo;

public class Filme extends Conteudo{
    int duracaoFilme;
    public Filme(String nome, int anoLancamento, int duracaoFilme) {
        super(nome, anoLancamento);
        this.duracaoFilme = duracaoFilme;
    }


    public int getDuracaoFilme() {
        return duracaoFilme;
    }

    public void setDuracaoFilme(int duracaoFilme) {
        this.duracaoFilme = duracaoFilme;
    }

    public Filme(String nome, int anoLancamento) {
        super(nome, anoLancamento);
    }

    @Override
    public int calcularTempo() {
        return this.duracaoFilme;
    }
}
