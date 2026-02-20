package oo.composicao.encapsulamento.casaA;

public class Paulo {
    Ana esposa = new Ana();

//    segredo
//    facoDentroDeCasa
//    formaDeFalar
//    todosSabem
//
    void testeAcessos(){
        //System.out.println(esposa.segredo);
        System.out.println(esposa.facoDentroDeCasa);
        System.out.println(esposa.formaDeFalar);
        System.out.println(esposa.todosSabem);

    }
}
