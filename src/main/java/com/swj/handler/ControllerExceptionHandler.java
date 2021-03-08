package com.swj.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ControllerExceptionHandler {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    // 标识做异常处理
    @ExceptionHandler(Exception.class)
    public String exceptionHandler(HttpServletRequest request,Exception e,Model model) throws Exception {
        logger.error("Requst URL:{},Exceprion:{}",request.getRequestURL(),e.getMessage());
        if(AnnotationUtils.findAnnotation(e.getClass(), ResponseStatus.class) != null){
            throw e;
        }
        model.addAttribute("url",request.getRequestURL());
        model.addAttribute("exception",e);
        return "error/error";
    }
}
