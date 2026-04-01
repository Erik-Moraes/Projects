package com.exercicios;

import com.exercicios.naruto.BolsaNinja;
import com.exercicios.naruto.Kunai;
import com.exercicios.naruto.Pergaminho;
import com.exercicios.naruto.Shuriken;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {






        //Exercicio Naruto
        BolsaNinja <Object> bolsa = new BolsaNinja();

        bolsa.adicionaFerramentas(new Kunai("Explosive Kunai"));
        bolsa.adicionaFerramentas(new Shuriken(10));
        bolsa.adicionaFerramentas(new Pergaminho("Pergaminho de invocação do sapo"));

        System.out.println("Ferramentas da bolsa: ");
        bolsa.mostrarFerramentas();

    }
}