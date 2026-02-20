package oo.composicao.abstrato;

public abstract class Mamifero  extends Animal{
    @Override
    public String mover() {
        return "Com das patas";
    }
    public abstract String mamar();
}
