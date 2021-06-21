package br.com.ronald.api;

import java.util.regex.PatternSyntaxException;

import javax.validation.constraints.Pattern;
import javax.ws.rs.BadRequestException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;

import br.com.correios.bsb.sigep.master.bean.cliente.AtendeCliente;
import br.com.correios.bsb.sigep.master.bean.cliente.AtendeClienteService;
import br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP;
import br.com.correios.bsb.sigep.master.bean.cliente.SQLException_Exception;
import br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException;
import br.com.ronald.model.Address;
import br.com.ronald.model.Error;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Path("/busca/{cep}")
@Api(description = "the busca API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2021-06-18T14:03:56.588-03:00[America/Sao_Paulo]")public class BuscaApi {

    @GET
    @Produces({ "application/json" })
    @ApiOperation(value = "return an address", notes = "return an address", response = Address.class, tags={ "consult" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Address.class),
        @ApiResponse(code = 400, message = "cep Formated Invalid", response = Error.class),
        @ApiResponse(code = 404, message = "Address not found", response = Error.class),
        @ApiResponse(code = 500, message = "Server Error", response = Error.class)
    })
    public Response getAddress(@PathParam("cep") String cep) {
    	
    	AtendeClienteService service = new AtendeClienteService();
    	AtendeCliente cliente = service.getAtendeClientePort();
    	String enderecoJson;
    	EnderecoERP endereco;
    	Response response;
    	
    	if (!cep.matches("\\d{5}-?\\d{3}")) {
    		return  Response.status(400).entity(new Error("cep Formated Invalid")).build();
    	}
    	
    	
    	try {
    		endereco = cliente.consultaCEP(cep);
    		enderecoJson = new Gson().toJson(endereco);
			response = Response.ok().entity(enderecoJson).build();
		} catch (SQLException_Exception e) {
			e.printStackTrace();
			response = Response.status(500).entity(new Error("Server Internal Error")).build();
		} catch (SigepClienteException e) {
			response = Response.status(404).entity(new Error("Address Not found")).build();
			e.printStackTrace();
		} 
    	
    	
		return response;
    	
    }
}
