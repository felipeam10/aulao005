package com.devsuperior.myfirstproject.services.exceptions;

public class EntityNofFoundException extends RuntimeException {
    public EntityNofFoundException(String msg) {
        super(msg);
    }
}
