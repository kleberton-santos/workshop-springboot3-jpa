package com.educandoweb.course.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(Object id) {
		// erro quando não existe um id
		super("Resource not found. Id " + id);
	}

}
