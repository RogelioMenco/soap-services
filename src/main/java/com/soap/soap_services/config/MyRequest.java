package com.soap.soap_services.config;

import java.io.Serial;
import java.io.Serializable;

public class MyRequest implements Serializable {
	@Serial
	private static final long serialVersionUID = 1L;

	private String requestType;
	private String requestData;
	private String name;

	public MyRequest() {
	}

	public MyRequest(String requestType, String requestData, String name) {
		this.requestType = requestType;
		this.requestData = requestData;
		this.name = name;
	}

	@SuppressWarnings("unused")
	public String getRequestType() {
		return requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	@SuppressWarnings("unused")
	public String getRequestData() {
		return requestData;
	}

	public void setRequestData(String requestData) {
		this.requestData = requestData;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
