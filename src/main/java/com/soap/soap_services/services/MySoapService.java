package com.soap.soap_services.services;

import com.soap.soap_services.config.MyRequest;
import com.soap.soap_services.config.MyResponse;
import org.springframework.stereotype.Service;

@Service
public class MySoapService {

	public MyResponse processRequest(MyRequest request) {
		MyResponse response = new MyResponse();
		response.setMessage("Hello, " + request.getName());
		return response;
	}
}
