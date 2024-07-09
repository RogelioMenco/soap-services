package com.soap.soap_services.services;

import com.soap.soap_services.config.MyRequest;
import com.soap.soap_services.config.MyResponse;
import com.soap.soap_services.submitrequestresponse.SubmitRequestResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class RealtimeService {

	private static final Logger logger = LoggerFactory.getLogger(RealtimeService.class);

	public MyResponse processRequest(MyRequest request) {
		String message = "Hello, " + request.getName();

		// Usando SubmitRequestResponse
		SubmitRequestResponse response = new SubmitRequestResponse();
		response.setResponseMessage(message);

		// Ejemplo de uso del getter
		logger.info("Response Message: {}", response.getResponseMessage());

		return new MyResponse(message);
	}
}
