package excecao.personalizadaA;

import excecao.Aluno;

public class TesteValidacoes {
    static void main(String[] args) {
        try {
            Aluno aluno = new Aluno("", 7);
            Validar.aluno(aluno);
        } catch (StringVaziaException e) {
            System.out.println(e.getMessage());
        }catch (NumeroForaDoIntervaloException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("FIM<3");
    }
}

