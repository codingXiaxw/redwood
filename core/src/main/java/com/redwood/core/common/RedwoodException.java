package com.redwood.core.common;

public class RedwoodException extends RuntimeException{
    public RedwoodException(String message) {
        super(message);
    }

    public RedwoodException(Exception ex){
        super(ex);
    }
}