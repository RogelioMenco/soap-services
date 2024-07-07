package com.soap;

import java.io.Serializable;

/**
 * Clase MyRequest que implementa Serializable.
 */
public class MyRequest implements Serializable {
	private static final long serialVersionUID = 1L;

	private String requestType;
	private String requestData;
	private String name; // Nuevo campo para el nombre

	/**
	 * Constructor vacío.
	 */
	public MyRequest() {
	}

	/**
	 * Constructor con todos los campos.
	 *
	 * @param requestType Tipo de solicitud.
	 * @param requestData Datos de la solicitud.
	 * @param name Nombre de la solicitud.
	 */
	public MyRequest(String requestType, String requestData, String name) {
		this.requestType = requestType;
		this.requestData = requestData;
		this.name = name;
	}

	/**
	 * Obtiene el tipo de solicitud.
	 *
	 * @return El tipo de solicitud puede ser nulo.
	 */
	@SuppressWarnings("unused")
	public String getRequestType() {
		return requestType;
	}

	/**
	 * Establece el tipo de solicitud.
	 *
	 * @param requestType El tipo de solicitud a establecer.
	 */
	@SuppressWarnings("unused")
	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	/**
	 * Obtiene los datos de la solicitud.
	 *
	 * @return Los datos de la solicitud pueden ser nulos.
	 */
	@SuppressWarnings("unused")
	public String getRequestData() {
		return requestData;
	}

	/**
	 * Establece los datos de la solicitud.
	 *
	 * @param requestData Los datos de la solicitud a establecer.
	 */
	@SuppressWarnings("unused")
	public void setRequestData(String requestData) {
		this.requestData = requestData;
	}

	/**
	 * Obtiene el nombre de la solicitud.
	 *
	 * @return El nombre de la solicitud puede ser nulo.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Establece el nombre de la solicitud.
	 *
	 * @param name El nombre de la solicitud a establecer.
	 */
	@SuppressWarnings("unused")
	public void setName(String name) {
		this.name = name;
	}
}
