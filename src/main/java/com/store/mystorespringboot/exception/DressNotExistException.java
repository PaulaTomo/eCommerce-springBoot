package com.store.mystorespringboot.exception;

public class DressNotExistException extends RuntimeException{
    public DressNotExistException() {
    }

    public DressNotExistException(String message) {
        super(message);
    }

    public DressNotExistException(String message, Throwable cause) {
        super(message, cause);
    }

    public DressNotExistException(Throwable cause) {
        super(cause);
    }

    public DressNotExistException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
