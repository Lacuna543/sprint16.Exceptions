package com.softserve.edu.exception;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(EntityNotFoundException.class)
    public ModelAndView handleMyCustomException(Exception exception) {
        ModelAndView model = new ModelAndView("error_page");
        model.addObject("info", exception.getMessage());
        model.setStatus(HttpStatus.BAD_REQUEST);
        return model;
    }

    @ExceptionHandler(DataIntegrityViolationException.class)
    public ModelAndView handleMyCustomException(DataIntegrityViolationException exception) {
        ModelAndView model = new ModelAndView("error_page");
        String detail = exception.getMostSpecificCause().toString();
        model.addObject("info", detail.substring(detail.indexOf("Подробности:")));
        model.setStatus(HttpStatus.BAD_REQUEST);
        return model;
    }
}
