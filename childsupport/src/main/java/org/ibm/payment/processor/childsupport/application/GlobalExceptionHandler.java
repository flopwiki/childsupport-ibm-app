package org.ibm.payment.processor.childsupport.application;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.logging.Logger;

@ControllerAdvice
public class GlobalExceptionHandler {
    Logger logger = Logger.getLogger(GlobalExceptionHandler.class.getName());

    @ExceptionHandler(Exception.class)
    public ModelAndView errorHandler(HttpServletRequest request, Exception ex) {
    ModelAndView mav = new ModelAndView("error");
    mav.addObject("error", "Something went wrong");
    mav.addObject("message", ex.getMessage());
    mav.addObject("status", getHttpStatus(request));
    mav.addObject("path", request.getRequestURI());

    logger.info("Error page occurred: " + ex.getMessage());
    logger.info(" " + ex.fillInStackTrace());

    return mav;

    }

    private Object getHttpStatus(HttpServletRequest request) {
        Integer status = (Integer) request.getAttribute("jakarta.servlet.error_status_code");
        return status != null ? status : 500;
    }

}

