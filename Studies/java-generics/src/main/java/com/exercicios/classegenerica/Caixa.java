package com.exercicios.classegenerica;

import java.util.ArrayList;
import java.util.List;

public class Caixa <T> {

    public static void main(String[] args) {

        Caixa <String> caixaTexto = new Caixa<>();
        caixaTexto.guardar("Salve");
        caixaTexto.guardar("Sei lá o que ");
        caixaTexto.guardar("Guarana com rolha ");
        caixaTexto.guardar("Mais alguma coisa");

        Caixa <Integer> caixaInt = new Caixa<>();
        caixaInt.guardar(4002);
        caixaInt.guardar(2003);

        List valor = caixaTexto.obter();
        List valor2 = caixaInt.obter();
        System.out.println(valor);
        System.out.println(valor2);
    }

    //Metodos da classe
    private List<T> valores = new ArrayList<>();

    public void guardar (T valor){
        valores.add(valor);
    }

    public List<T> obter(){
        return valores;
    }


}
