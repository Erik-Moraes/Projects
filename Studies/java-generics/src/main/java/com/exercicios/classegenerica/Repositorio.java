package com.exercicios.classegenerica;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Repositorio <T extends Comparable<T>>{

    private List<T> valores = new ArrayList<>();

    public void adicionaElementos(T valor){

        valores.add(valor);
    }

    public Optional<T> obterMaior(){

        return valores.stream().
        max(Comparable::compareTo);

    }


    public static void main(String[] args) {

        Repositorio repo = new Repositorio();

        repo.adicionaElementos(10);
        repo.adicionaElementos(20);
        repo.adicionaElementos(30);

        System.out.println(repo.obterMaior().orElse(null));

    }
}
