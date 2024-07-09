package com.soap.soap_services.client;

import com.soap.soap_services.config.MyRequest;
import com.soap.soap_services.config.MyResponse;
import com.soap.soap_services.services.RealtimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RealtimeClient {

	private final RealtimeService realtimeService;

	@Autowired
	public RealtimeClient(RealtimeService realtimeService) {
		this.realtimeService = realtimeService;
	}

	public MyResponse submitRequest(String entityId, String requestType) {
		MyRequest request = new MyRequest();
		request.setRequestType(requestType);
		request.setRequestData(entityId);
		request.setName("RequestName"); // Set a default name, adjust as needed
		return realtimeService.processRequest(request);
	}
}
