package com.zhanglin.networkSlicingBackend.ms.exception;

import javax.servlet.http.HttpServletRequest;


import com.zhanglin.networkSlicingBackend.ms.model.MyResponse;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
	
	//Handle all the unknown exception
	 @ExceptionHandler(value = Exception.class)
	 @ResponseBody
	    public Object defaultErrorHandler(HttpServletRequest req, Exception e) {
	    	log.info("Exception Response:{}",e);
	        return MyResponse.error(MyResponse.ERROR_CODE, "Exception:"+e.getMessage());
	    }
	 
	//Handle all the user defined exception(MAException)
    @ExceptionHandler(value = MyException.class)
    @ResponseBody
    public Object maExceptionHandler(HttpServletRequest req, MyException e) {
    	    log.info("MAException Response:{}",e);
    	    return MyResponse.error(e.getCode(), e.getMessage());
    }
    
    
    //Handle all the argument not valid exception for ETCP Notification
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    @ResponseBody
    public Object handleMethodArgumentNotValidException(HttpServletRequest req,MethodArgumentNotValidException e) {
        String message = e.getBindingResult().getAllErrors().get(0).getDefaultMessage();
        log.info("MethodArgumentNotValidException Response:{}",message);
        return MyResponse.error(MyResponse.ERROR_CODE, message);
    }

}