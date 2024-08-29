package com.todoapp.todoProject.exception;

import org.springframework.http.HttpStatus;

public class TaskNotFoundException extends BaseErrorException{
    private static final String message = "task not found";
    private static final HttpStatus code = HttpStatus.NOT_FOUND;
    public TaskNotFoundException(){
        super(message,code);
    }

}
