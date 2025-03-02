package com.azarquiel.s2daw.sinnohapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GeneralException {
    @ExceptionHandler
    public ResponseEntity<RespuestaException> handleException(Exception ex) {

        RespuestaException respuesta = new RespuestaException();

        respuesta.setStatus(HttpStatus.NOT_FOUND.value());
        respuesta.setMessage(ex.getMessage());
        respuesta.setTimestamp(System.currentTimeMillis());

        return new ResponseEntity<>(respuesta, HttpStatus.NOT_FOUND);
    }
}
