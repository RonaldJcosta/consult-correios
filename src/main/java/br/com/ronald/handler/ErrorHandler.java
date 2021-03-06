package br.com.ronald.handler;

import javax.ws.rs.core.Response;
import br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP;
import br.com.correios.bsb.sigep.master.bean.cliente.SQLException_Exception;
import br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException;
import br.com.ronald.model.ErrorModel;
import br.com.ronald.services.CepService;

public class ErrorHandler {
	
	private CepService cepService = new CepService();
	
	public Response getResponse(String cep) {
		Response response = null;
				
		if(!cep.matches("\\d{5}-\\d{3}")) 
			response = Response.status(400).entity(new ErrorModel("cep Formated Invalid")).build();
		
		try {
			
			EnderecoERP endereco = cepService.consulta(cep);
			response = Response.ok().entity(endereco).build();
			
		} catch (SQLException_Exception e) {
			e.printStackTrace();
			response =  Response.status(500).entity(new ErrorModel("Server Error")).build();
			
		} catch (SigepClienteException e) {
			
			response =  Response.status(404).entity(new ErrorModel("Address not found")).build();
			
		} catch(Exception e) {
			
			response =  Response.status(500).entity(new ErrorModel("Server Internal Error")).build();
		}
		
		return response;
		
	}
	
	
	
}
