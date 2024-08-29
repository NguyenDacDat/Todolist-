package com.todoapp.todoProject.exception;

import org.springframework.http.HttpStatus;

public class BadCreateTaskException extends BaseErrorException {
    private static final String message = "create task is bad";
    private static final HttpStatus code = HttpStatus.BAD_REQUEST;
    public BadCreateTaskException() {
        super(message,code);
    }
}
