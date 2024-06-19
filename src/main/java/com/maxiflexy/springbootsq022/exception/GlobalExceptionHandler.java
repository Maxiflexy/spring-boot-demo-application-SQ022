package com.maxiflexy.springbootsq022.exception;

import com.maxiflexy.springbootsq022.payload.response.ErrorDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(EmailAlreadyExistException.class)
    public ResponseEntity<ErrorDetails> handleEmailAlreadyExistException(final EmailAlreadyExistException e){

        ErrorDetails errorDetails = new ErrorDetails();
        errorDetails.setTimeStamp(LocalDateTime.now());
        errorDetails.setErrorMessage(e.getMessage());
        errorDetails.setErrorMessage(String.valueOf(HttpStatus.CONFLICT));

        return new ResponseEntity<>(errorDetails, HttpStatus.CONFLICT);
    }



}
