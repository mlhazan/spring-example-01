package com.spring.mvc;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class GlobalExceptionHandler {

     //@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
     @ExceptionHandler(value = Exception.class)
     public String handleException(Exception e) {
          return "Exception";
     }
}
