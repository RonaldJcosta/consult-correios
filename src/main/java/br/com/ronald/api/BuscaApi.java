package br.com.ronald.api;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import br.com.ronald.controllers.CepController;
import br.com.ronald.model.Address;
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
    	CepController cepController = new CepController();
    	
		return cepController.root_getRequest(cep) ;
    	
    }
}
