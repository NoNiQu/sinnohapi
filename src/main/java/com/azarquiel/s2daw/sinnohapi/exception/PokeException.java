package com.azarquiel.s2daw.sinnohapi.exception;

public class PokeException extends RuntimeException {
    public PokeException(String message) {
        super(message);
    }

    public PokeException(String message, Throwable cause) {
        super(message, cause);
    }

    public PokeException(Throwable cause) {
        super(cause);
    }

    public PokeException() {
    }

}
