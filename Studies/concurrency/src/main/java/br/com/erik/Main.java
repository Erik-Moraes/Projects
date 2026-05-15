package br.com.erik;

public class Main {
    public static void main(String[] args) {

        Thread thread = new Thread(new MyThread());
        Thread thread2 = new Thread(new MyThread());

        thread.start();
        thread2.start();

    }
}