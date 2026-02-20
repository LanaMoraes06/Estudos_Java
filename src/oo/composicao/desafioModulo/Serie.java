package oo.composicao.desafioModulo;

public class Serie extends Conteudo{
    int total = 0;
    int temporadas;
    int qtdEpisodios;
    int qtdMinutos;

    public Serie(String nome, int anoLancamento, int temporadas, int qtdEpisodios,  int qtdMinutos) {
        super(nome, anoLancamento);
        this.temporadas = temporadas;
        this.qtdEpisodios = qtdEpisodios;
        this.qtdMinutos = qtdMinutos;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getQtdEpisodios() {
        return qtdEpisodios;
    }

    public void setQtdEpisodios(int qtdEpisodios) {
        this.qtdEpisodios = qtdEpisodios;
    }

    public int getQtdMinutos() {
        return qtdMinutos;
    }

    public void setQtdMinutos(int qtdMinutos) {
        this.qtdMinutos = qtdMinutos;
    }

    @Override
    public int calcularTempo() {
        return  temporadas * qtdEpisodios * qtdMinutos;
    }
}
