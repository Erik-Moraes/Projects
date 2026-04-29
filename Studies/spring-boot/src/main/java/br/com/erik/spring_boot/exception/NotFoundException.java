package br.com.erik.spring_boot.exception;

public class NotFoundException extends Exception{

    public NotFoundException (String message){

        super(message);
    }
}
