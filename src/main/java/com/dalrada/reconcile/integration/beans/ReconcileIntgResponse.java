package com.dalrada.reconcile.integration.beans;

import com.dalrada.reconcile.integration.entity.OrderDetails;

public class ReconcileIntgResponse {

	private String responseCode ;
	private String responseMsg ;
	private OrderDetails respBody ;
	public String getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	public String getResponseMsg() {
		return responseMsg;
	}
	public void setResponseMsg(String responseMsg) {
		this.responseMsg = responseMsg;
	}
	public OrderDetails getRespBody() {
		return respBody;
	}
	public void setRespBody(OrderDetails respBody) {
		this.respBody = respBody;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ReconcileIntgResponse [responseCode=").append(responseCode).append(", responseMsg=")
				.append(responseMsg).append(", respBody=").append(respBody).append("]");
		return builder.toString();
	}
	

}
