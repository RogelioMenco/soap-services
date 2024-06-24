package com.soap.soap.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.example.soap.service.MySoapService;
import com.example.soap.MyRequest;
import com.example.soap.MyResponse;

@Endpoint
public class MySoapEndpoint {

    private static final String NAMESPACE_URI = "http://soap.com/soap";
    private final MySoapService mySoapService;

    public MySoapEndpoint(MySoapService mySoapService) {
        this.mySoapService = mySoapService;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "MyRequest")
    @ResponsePayload
    public MyResponse handleMyRequest(@RequestPayload MyRequest request) {
        return mySoapService.processRequest(request);
    }
}
