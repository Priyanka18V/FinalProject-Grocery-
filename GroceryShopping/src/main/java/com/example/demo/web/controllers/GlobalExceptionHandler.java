package com.example.demo.web.controllers;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import static com.example.demo.util.AppConstants.*;

@ControllerAdvice
public class GlobalExceptionHandler extends BaseController {

    @ExceptionHandler({Throwable.class})
    public ModelAndView handleSqlException(Throwable e) {
        ModelAndView modelAndView = new ModelAndView(ERROR);

        Throwable throwable = e;

        while (throwable.getCause() != null) {
            throwable = throwable.getCause();
        }

        modelAndView.addObject(MESSAGE, throwable.getMessage());

        return modelAndView;
    }
}
