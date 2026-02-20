package oo.composicao.desafioModulo;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public void incluir(Conteudo t) {
        System.out.println("Adicionando " + t.getNome() + " à maratona...");

        this.tempoTotal += t.calcularTempo();
    }

    public int getTempoTotal() {
        return this.tempoTotal;
    }
}
