package com.todoapp.todoProject.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class BaseErrorExceptionController {
    @ExceptionHandler(value = BaseErrorException.class)
    public ResponseEntity<BaseError> notFoundException(BaseErrorException ex) {
        return ex.asResponseEntity();
    }
}
