package com.imageupload.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.imageupload.exception.ImageUloadExceptions.InvalidUserException;

@ControllerAdvice
public class ImageUloadExceptionHanddler {

    @ExceptionHandler(InvalidUserException.class)
    public ResponseEntity<String> handlerValidationException(InvalidUserException ex){
        HttpStatus httpStatus = HttpStatus.BAD_REQUEST;
        return new ResponseEntity<>(ex.getMessage(), httpStatus);
        
        
    }
}
