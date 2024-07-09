package com.soap.soap_services.endpoint;

import com.soap.soap_services.config.MyRequest;
import com.soap.soap_services.config.MyResponse;
import com.soap.soap_services.services.MySoapService;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Endpoint
public class MySoapEndpoint {

	private static final String NAMESPACE_URI = "http://example.com/soap";
	private static final Logger logger = LoggerFactory.getLogger(MySoapEndpoint.class);
	private final MySoapService mySoapService;

	public MySoapEndpoint(MySoapService service) {
		this.mySoapService = service;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "MyRequest")
	@ResponsePayload
	public MyResponse handleMyRequest(@RequestPayload MyRequest request) {
		MyResponse response = mySoapService.processRequest(request);
		logger.info("Response message: {}", response.getMessage());
		return response;
	}
}
