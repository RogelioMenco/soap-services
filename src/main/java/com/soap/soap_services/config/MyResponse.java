package com.soap.soap_services.config;

import java.io.Serial;
import java.io.Serializable;

/**
 * Clase MyResponse que implementa Serializable.
 */
public class MyResponse implements Serializable {
	@Serial
	private static final long serialVersionUID = 1L;

	private String message;

	/**
	 * Constructor vacío.
	 */
	public MyResponse() {
	}

	/**
	 * Constructor con todos los campos.
	 *
	 * @param message Mensaje de respuesta.
	 */
	public MyResponse(String message) {
		this.message = message;
	}

	/**
	 * Obtiene el mensaje de respuesta.
	 *
	 * @return El mensaje de respuesta puede ser nulo.
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Establece el mensaje de respuesta.
	 *
	 * @param message El mensaje de respuesta a establecer.
	 */
	public void setMessage(String message) {
		this.message = message;
	}
}
