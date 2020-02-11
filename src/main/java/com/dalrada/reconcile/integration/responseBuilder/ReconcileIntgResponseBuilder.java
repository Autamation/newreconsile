package com.dalrada.reconcile.integration.responseBuilder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.dalrada.reconcile.integration.beans.ReconcileIntgResponse;
import com.dalrada.reconcile.integration.entity.OrderDetails;

@Component
public class ReconcileIntgResponseBuilder {
	private static final Logger logger = LoggerFactory.getLogger(ReconcileIntgResponseBuilder.class);
	public ReconcileIntgResponse buildResponse(OrderDetails entity) {
		logger.debug("enter into buildResponse method");
		ReconcileIntgResponse response = new ReconcileIntgResponse();
		response.setResponseCode("200");
		response.setResponseMsg("successfull");
		response.setRespBody(entity);
		logger.debug("exit from buildResponse method");
		return response;		
	}

	public ReconcileIntgResponse buildResponse(String responseCode, String respMsg) {
		logger.debug("enter into buildResponse method");
		ReconcileIntgResponse response = new ReconcileIntgResponse();
		response.setResponseCode(responseCode);
		response.setResponseMsg(respMsg);
		logger.debug("exit from buildResponse method");
		return response;	

	}

}
