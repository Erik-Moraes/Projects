package com.exercicios.naruto;

public class Pergaminho {

    private String content;

    public Pergaminho(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "This pergaminho is: " + content;
    }
}
