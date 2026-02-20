package exercicios;

public class DesafioWhile {
    public static void main(String[] args) {
        for(String v = "*"; !v.equals("******"); v+= "*"){
            System.out.println(v);
        }
    }
}
