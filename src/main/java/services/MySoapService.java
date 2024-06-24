package com.soap.soap.service;

import org.springframework.stereotype.Service;

import com.example.soap.MyRequest;
import com.example.soap.MyResponse;

@Service
public class MySoapService {

    public MyResponse processRequest(MyRequest request) {
        MyResponse response = new MyResponse();
        response.setMessage("Hello, " + request.getName());
        return response;
    }
}
