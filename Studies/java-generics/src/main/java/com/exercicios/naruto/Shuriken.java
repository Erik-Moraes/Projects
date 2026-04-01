package com.exercicios.naruto;

public class Shuriken {

    private int amount;

    public Shuriken(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "The amount of Shuriken is: " + amount;
    }


}