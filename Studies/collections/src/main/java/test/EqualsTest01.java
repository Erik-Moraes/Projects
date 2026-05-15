package test;

import dominio.Smartphone;

public class EqualsTest01 {

    public static void main(String[] args) {

    Smartphone s1 = new Smartphone("Iphone", "XYZ123");
    Smartphone s2 = new Smartphone("Iphone", "XYZ123");

        System.out.println(s1.equals(s2));


    }
}
