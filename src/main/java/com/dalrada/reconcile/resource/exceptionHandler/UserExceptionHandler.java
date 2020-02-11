package com.dalrada.reconcile.resource.exceptionHandler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.dalrada.reconcile.integration.exception.BusinessException;
import com.dalrada.reconcile.integration.exception.SystemException;
import com.dalrada.reconcile.resource.beans.ReconcileResourceResponse;
import com.dalrada.reconcile.resource.exception.InvalidRequestException;


@ControllerAdvice
public class UserExceptionHandler {
	
	@ExceptionHandler(InvalidRequestException.class)
	public ReconcileResourceResponse invalidRequestExceptionHandler(InvalidRequestException ex){
		ReconcileResourceResponse response = new ReconcileResourceResponse();
		response.setResponseCode(ex.getErrorCode());
		response.setResponseMsg(ex.getErrorMsg());
		return response;	
	}
	@ExceptionHandler(SystemException.class)
	public ReconcileResourceResponse systemExceptionHandler(SystemException ex){
		ReconcileResourceResponse response = new ReconcileResourceResponse();
		response.setResponseCode(ex.getErrorCode());
		response.setResponseMsg(ex.getErrorMsg());
		return response;	
	}
	@ExceptionHandler(BusinessException.class)
	public ReconcileResourceResponse businessExceptionHandler(BusinessException ex){
		ReconcileResourceResponse response = new ReconcileResourceResponse();
		response.setResponseCode(ex.getErrorCode());
		response.setResponseMsg(ex.getErrorMsg());
		return response;	
	}
	
}

