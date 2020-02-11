package com.dalrada.reconcile.resource;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dalrada.reconcile.integration.exception.BusinessException;
import com.dalrada.reconcile.integration.exception.SystemException;
import com.dalrada.reconcile.process.ReconcileProcess;
import com.dalrada.reconcile.process.beans.ReconcileProcessResponse;
import com.dalrada.reconcile.resource.beans.ReconcileResourceResponse;
import com.dalrada.reconcile.resource.responseBuilder.ReconcileResourceResponseBuilder;


@RestController
public class ReconcileResource {
	
	ReconcileProcess process;
	ReconcileResourceResponseBuilder responsebuilder;
	private static final Logger logger = LoggerFactory.getLogger(ReconcileResource.class);
	@Autowired
	public ReconcileResource(ReconcileProcess process,
			ReconcileResourceResponseBuilder responsebuilder) {
		super();
		this.process = process;
		this.responsebuilder = responsebuilder;
	}

	
	
	@GetMapping("getAllUser")
	public List<ReconcileResourceResponse> getAllUsers() throws BusinessException, SystemException {
		logger.debug("enter into getAllUsers method");
		List<ReconcileProcessResponse> processRespList = process.getAllUser();
		List<ReconcileResourceResponse> resourceRespList = responsebuilder.buildResponse(processRespList);
		logger.debug("exit from getAllUsers method");
		return resourceRespList;	
	}

	@GetMapping("healthStatus")
	public String getHealth() {
		return "Service is up and running";
	}

}

