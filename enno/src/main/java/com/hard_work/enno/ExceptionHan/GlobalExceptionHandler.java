package com.hard_work.enno.ExceptionHan;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
@Service
public class GlobalExceptionHandler {

    // @ExceptionHandler(MethodArgumentNotValidException.class)
    // @ResponseStatus(HttpStatus.BAD_REQUEST)
    // public String handleValidationException(MethodArgumentNotValidException e,
    // Model model,
    // HttpServletRequest request) {
    // String errorMessage = "Validation error: " +
    // e.getBindingResult().getFieldError().getDefaultMessage();
    // model.addAttribute("error", errorMessage + request.getRequestURI());
    // return "error";
    // }

    // @ExceptionHandler(Exception.class)
    // @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    // public String handleGenericException(Exception e, Model model,
    // HttpServletRequest request) {
    // // Customize this method based on your requirements for handling generic
    // // exceptions
    // model.addAttribute("error", "Internal Server Error:" +
    // request.getRequestURI());
    // return "error";
    // }
}