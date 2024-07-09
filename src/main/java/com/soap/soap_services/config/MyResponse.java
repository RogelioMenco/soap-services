package com.soap.soap_services.config;

import java.io.Serial;
import java.io.Serializable;

public class MyResponse implements Serializable {
	@Serial
	private static final long serialVersionUID = 1L;

	private final String message; // Hacer el campo final si no hay set

	public MyResponse() {
		this.message = "";
	}

	public MyResponse(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		return "MyResponse{" +
				"message='" + getMessage() + '\'' +
				'}';
	}
}
