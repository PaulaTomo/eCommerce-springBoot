package com.store.mystorespringboot.exception;

public class ColorNotExistException extends RuntimeException{
    public ColorNotExistException() {
    }

    public ColorNotExistException(String message) {
        super(message);
    }

    public ColorNotExistException(String message, Throwable cause) {
        super(message, cause);
    }

    public ColorNotExistException(Throwable cause) {
        super(cause);
    }

    public ColorNotExistException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
