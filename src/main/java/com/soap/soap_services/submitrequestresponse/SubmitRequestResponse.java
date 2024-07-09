package com.soap.soap_services.submitrequestresponse;

import java.io.Serial;
import java.io.Serializable;

public class SubmitRequestResponse implements Serializable {
	@Serial
	private static final long serialVersionUID = 1L;

	private String responseMessage;

	// Getters y Setters
	public String getResponseMessage() {
		return responseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}

	@Override
	public String toString() {
		return "SubmitRequestResponse{" +
				"responseMessage='" + responseMessage + '\'' +
				'}';
	}
}
