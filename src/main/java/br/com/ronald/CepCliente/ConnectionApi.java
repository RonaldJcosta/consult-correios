package br.com.ronald.CepCliente;
import br.com.correios.bsb.sigep.master.bean.cliente.AtendeCliente;
import br.com.correios.bsb.sigep.master.bean.cliente.AtendeClienteService;

public class ConnectionApi {
	
	public AtendeCliente makeclient() {
		
		AtendeClienteService service = new AtendeClienteService();
    	AtendeCliente client = service.getAtendeClientePort();
    	
    	
    	return client;
		
	}
	
}
