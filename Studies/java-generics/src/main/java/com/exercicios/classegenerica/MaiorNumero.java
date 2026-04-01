package com.exercicios.classegenerica;

public class MaiorNumero <T>{

    private T a, b;

    public static <T extends Comparable> T maior(T a, T b){

        return(a.compareTo(b) >= 0) ? a : b;

    };


    public static void main(String[] args) {

        System.out.println(maior(40.1, 40.2));
        System.out.println(maior("Erik", "Bruna"));
    }
}
