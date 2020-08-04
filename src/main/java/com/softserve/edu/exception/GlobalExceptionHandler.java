package com.softserve.edu.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(NoHandlerFoundException.class)
    public String handlerPageNotFoundException() {
        return "/error/404";
    }

    @ExceptionHandler(EntityNotFoundException.class)
    public ModelAndView handleMyCustomException(EntityNotFoundException exception) {
//        ModelAndView model = new ModelAndView("/error/error_page");
        ModelAndView model = new ModelAndView("error_page");
        model.addObject("info", exception.getMessage());
        model.setStatus(HttpStatus.BAD_REQUEST);
        return model;
    }
}
