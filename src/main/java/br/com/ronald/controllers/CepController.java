package br.com.ronald.controllers;

import javax.ws.rs.core.Response;

import br.com.ronald.handler.ErrorHandler;

public class CepController {
	
	public Response root_getRequest(String cep) {
		
		ErrorHandler errorHandler = new ErrorHandler();
		
		return errorHandler.getResponse(cep);
	}
	
}
