package com.todoapp.todoProject.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class BaseErrorException extends RuntimeException {
    protected String message;
    protected HttpStatus code;
    public BaseErrorException(){}

    public BaseErrorException(String message,HttpStatus code){
        super(message);
        this.message=message;
        this.code=code;
    }
    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public HttpStatus getCode() {
        return code;
    }

    public void setCode(HttpStatus code) {
        this.code = code;
    }
    public ResponseEntity<BaseError> asResponseEntity(){
        return new ResponseEntity<>(new BaseError(message,code.name()),code);
    }

}
