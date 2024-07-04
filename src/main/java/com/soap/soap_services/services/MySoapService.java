package com.soap.soap_services.services;

import org.springframework.stereotype.Service;
import com.soap.soap_services.MyRequest;
import com.soap.soap_services.MyResponse;

@Service
public class MySoapService {

    public MyResponse processRequest(MyRequest request) {
        MyResponse response = new MyResponse();
        response.setMessage("Hello, " + request.getName());
        return response;
    }
}

