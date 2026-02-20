package Array_Collections;

public class Equals {
    static void main(String[] args) {
        Usuario u1 = new Usuario();
        u1.nome = "Gusthavo";
        u1.email = "gustavoerick2007@gmail.com";

        Usuario u2 = new Usuario();
        u2.nome = "Gusthavo";
        u2.email = "gustavoerick2007@gmail.com";


        System.out.println(u1.equals(u2));
        System.out.println(u2.equals(u1));
    }
}
