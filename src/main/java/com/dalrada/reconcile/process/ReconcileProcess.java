package com.dalrada.reconcile.process;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dalrada.reconcile.integration.ReconcileIntegration;
import com.dalrada.reconcile.integration.beans.ReconcileIntgResponse;
import com.dalrada.reconcile.integration.exception.BusinessException;
import com.dalrada.reconcile.integration.exception.SystemException;
import com.dalrada.reconcile.process.beans.ReconcileProcessResponse;
import com.dalrada.reconcile.process.responseBuilder.ReconcileProcessResponseBuilder;

@Component
public class ReconcileProcess {

	ReconcileIntegration Intg;
	ReconcileProcessResponseBuilder responseBuilder;
	private static final Logger logger = LoggerFactory.getLogger(ReconcileProcess.class);
	@Autowired
	public ReconcileProcess(ReconcileIntegration intg,
			ReconcileProcessResponseBuilder responseBuilder) {
		super();
		Intg = intg;
		this.responseBuilder = responseBuilder;
	}

	
	public List<ReconcileProcessResponse> getAllUser() throws BusinessException, SystemException {
		logger.debug("enter into getAllUsers method");
		List<ReconcileIntgResponse> intgRespList = Intg.getAllUsers();
		List<ReconcileProcessResponse> processRespList = responseBuilder.buildResponse(intgRespList);
		logger.debug("exit from getAllUsers method");
		return processRespList;
	}



}
