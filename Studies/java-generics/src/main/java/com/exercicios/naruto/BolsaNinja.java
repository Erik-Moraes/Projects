package com.exercicios.naruto;

import java.util.ArrayList;
import java.util.List;

public class BolsaNinja <T>{

    private List<T> ferramentas;

    
    public BolsaNinja() {
        this.ferramentas = new ArrayList<>();
    }

    public void adicionaFerramentas(T ferramenta) {
        ferramentas.add(ferramenta);
    }

    public void mostrarFerramentas(){

        for (T ferramenta : ferramentas){
            System.out.println(ferramenta);
        }
    }

}
