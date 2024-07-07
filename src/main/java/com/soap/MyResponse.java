package com.soap;

import java.io.Serializable;

/**
 * Clase MyResponse que implementa Serializable.
 */
public class MyResponse implements Serializable {
	private static final long serialVersionUID = 1L;

	private String message;
	private String name;

	/**
	 * Constructor vacío.
	 */
	public MyResponse() {
	}

	/**
	 * Constructor con todos los campos.
	 *
	 * @param message Mensaje de la respuesta.
	 * @param name Nombre de la respuesta.
	 */
	public MyResponse(String message, String name) {
		this.message = message;
		this.name = name;
	}

	/**
	 * Obtiene el mensaje.
	 *
	 * @return El mensaje puede ser nulo.
	 */
	@SuppressWarnings("unused")
	public String getMessage() {
		return message;
	}

	/**
	 * Establece el mensaje.
	 *
	 * @param message El mensaje a establecer.
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * Obtiene el nombre.
	 *
	 * @return El nombre puede ser nulo.
	 */
	@SuppressWarnings("unused")
	public String getName() {
		return name;
	}

	/**
	 * Establece el nombre.
	 *
	 * @param name El nombre a establecer.
	 */
	@SuppressWarnings("unused")
	public void setName(String name) {
		this.name = name;
	}
}
