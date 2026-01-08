package br.com.pizzariaDankiCode.cursoDanki.infraestrutura;

import jakarta.persistence.EntityNotFoundException;
import org.hibernate.action.internal.EntityActionVetoException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class TratadorExceptions {

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity tratarException404(){
        return ResponseEntity.notFound().build();
    }
}
