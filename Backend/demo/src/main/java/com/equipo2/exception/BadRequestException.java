package com.equipo2.exception;

public class BadRequestException extends Exception {

    public BadRequestException(String mensaje){
        super(mensaje);
    }
}
