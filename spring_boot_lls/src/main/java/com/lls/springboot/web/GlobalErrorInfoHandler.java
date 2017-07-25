package com.lls.springboot.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.lls.springboot.exception.ErrorInfoInterface;
import com.lls.springboot.exception.GlobalErrorInfoException;
import com.lls.springboot.exception.ResultBody;

@RestControllerAdvice
public class GlobalErrorInfoHandler {

	@ExceptionHandler(value = GlobalErrorInfoException.class)
	public ResultBody errorHandlerOverJson(HttpServletRequest request,
			GlobalErrorInfoException exception) {
		ErrorInfoInterface errorInfo = exception.getErrorInfo();
		ResultBody result = new ResultBody(errorInfo);
		return result;
	}
}
