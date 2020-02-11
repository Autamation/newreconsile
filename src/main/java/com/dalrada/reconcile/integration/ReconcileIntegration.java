package com.dalrada.reconcile.integration;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dalrada.reconcile.integration.beans.ReconcileIntgResponse;
import com.dalrada.reconcile.integration.entity.OrderDetails;
import com.dalrada.reconcile.integration.exception.BusinessException;
import com.dalrada.reconcile.integration.exception.SystemException;
import com.dalrada.reconcile.integration.repository.UserRepository;
import com.dalrada.reconcile.integration.responseBuilder.ReconcileIntgResponseBuilder;

@Component
public class ReconcileIntegration {

	UserRepository repository ;
	ReconcileIntgResponseBuilder responseBuilder ;
	private static final Logger logger = LoggerFactory.getLogger(ReconcileIntegration.class);
	@Autowired
	public ReconcileIntegration(UserRepository repository,
			ReconcileIntgResponseBuilder responseBuilder) {
		super();
		this.repository = repository;
		this.responseBuilder = responseBuilder;
	}


	public List<ReconcileIntgResponse> getAllUsers() throws BusinessException, SystemException {
		logger.debug("enter into getAllUsers method");
		List<OrderDetails> userList;
		try {
			userList = repository.findAll();
		} catch (RuntimeException e) {
			logger.error("Exception occured  " ,e);
			throw new SystemException("","");	
		}
		List<ReconcileIntgResponse> responseList = new ArrayList<ReconcileIntgResponse>();
		if(userList != null) {
			userList.forEach(user ->{
				ReconcileIntgResponse intgResponse = responseBuilder.buildResponse(user);
				responseList.add(intgResponse);
			});
			logger.debug("exit from getAllUsers method");
			return responseList;
		}
		else
			throw new BusinessException("505","data not present");
	}
}
