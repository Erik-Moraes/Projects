package com.exercicios.naruto;

public class Kunai {

    private String type;

    public Kunai(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Kunai type is: " + type;
    }

}
