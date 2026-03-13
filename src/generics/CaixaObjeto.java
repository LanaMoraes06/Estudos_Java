package generics;

public class CaixaObjeto {
    private Object coisa;

    public void setGuardar(Object coisa){
        this.coisa = coisa;
    }
    public Object abrir(){
        return coisa;
    }
}
