package com.soap.soap_services.services;

import com.soap.soap_services.config.MyRequest;
import com.soap.soap_services.config.MyResponse;
import org.springframework.stereotype.Service;

@Service
public class MySoapService {

	public MyResponse processRequest(MyRequest request) {
		String message = "Hello, " + request.getName();
		return new MyResponse(message);
	}
}
