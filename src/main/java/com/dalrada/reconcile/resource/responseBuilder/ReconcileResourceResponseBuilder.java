package com.dalrada.reconcile.resource.responseBuilder;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.dalrada.reconcile.process.beans.ReconcileProcessResponse;
import com.dalrada.reconcile.resource.beans.ReconcileResourceResponse;
import com.dalrada.reconcile.resource.beans.ResourceResponseBody;

@Component
public class ReconcileResourceResponseBuilder {
	private static final Logger logger = LoggerFactory.getLogger(ReconcileResourceResponseBuilder.class);
	

	public List<ReconcileResourceResponse> buildResponse(List<ReconcileProcessResponse> intgRespList) {
		logger.debug("enter into buildResponse method");
		List<ReconcileResourceResponse> processRespList = new ArrayList<ReconcileResourceResponse>();
		intgRespList.forEach(intgResponse ->{
			ReconcileResourceResponse resourceResponse = new ReconcileResourceResponse();
			resourceResponse.setResponseCode(intgResponse.getResponseCode());
			resourceResponse.setResponseMsg(intgResponse.getResponseMsg());
			ResourceResponseBody responseBody = new ResourceResponseBody();
			responseBody.setAddress_Line1(intgResponse.getRespBody().getAddress_Line1());
			responseBody.setAddress_Line2(intgResponse.getRespBody().getAddress_Line2());
			responseBody.setChannel_Name(intgResponse.getRespBody().getChannel_Name());
			responseBody.setCity(intgResponse.getRespBody().getCity());
			responseBody.setCompany(intgResponse.getRespBody().getCompany());
			responseBody.setCountry(intgResponse.getRespBody().getCountry());
			responseBody.setCustomer_Email(intgResponse.getRespBody().getCustomer_Email());
			responseBody.setCustomer_Name(intgResponse.getRespBody().getCustomer_Name());
			responseBody.setCustomer_Phone(intgResponse.getRespBody().getCustomer_Phone());
			responseBody.setOrder_Date(intgResponse.getRespBody().getOrder_Date());
			responseBody.setOrder_Number(intgResponse.getRespBody().getOrder_Number());
			responseBody.setOrder_Status(intgResponse.getRespBody().getOrder_Status());
			responseBody.setOrder_Total(intgResponse.getRespBody().getOrder_Total());
			responseBody.setPO_Number(intgResponse.getRespBody().getPO_Number());
			responseBody.setProduct_Name(intgResponse.getRespBody().getProduct_Name());
			responseBody.setQuantity(intgResponse.getRespBody().getQuantity());
			responseBody.setReference_Number(intgResponse.getRespBody().getReference_Number());
			responseBody.setSale_Price(intgResponse.getRespBody().getSale_Price());
			responseBody.setShipping_Carrier(intgResponse.getRespBody().getShipping_Carrier());
			responseBody.setShipping_Method(intgResponse.getRespBody().getShipping_Method());
			responseBody.setSKU(intgResponse.getRespBody().getSKU());
			responseBody.setSr_No(intgResponse.getRespBody().getSr_No());
			responseBody.setState(intgResponse.getRespBody().getState());
			responseBody.setStore_Order_Id(intgResponse.getRespBody().getStore_Order_Id());
			responseBody.setStore_Shipping_Method(intgResponse.getRespBody().getStore_Shipping_Method());
			responseBody.setSupplier_Cost_Per_SKU(intgResponse.getRespBody().getSupplier_Cost_Per_SKU());
			responseBody.setSupplier_Cost_Total(intgResponse.getRespBody().getSupplier_Cost_Total());
			responseBody.setSupplier_Name(intgResponse.getRespBody().getSupplier_Name());
			responseBody.setTracking_Numbers(intgResponse.getRespBody().getTracking_Numbers());
			responseBody.setZip(intgResponse.getRespBody().getZip());
			
			resourceResponse.setRespBody(responseBody);
			processRespList.add(resourceResponse);
		});
		logger.debug("exit from buildResponse method");
		return processRespList;
	}
	
}
