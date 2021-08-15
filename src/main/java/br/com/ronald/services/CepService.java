package br.com.ronald.services;
import br.com.correios.bsb.sigep.master.bean.cliente.AtendeCliente;
import br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP;
import br.com.correios.bsb.sigep.master.bean.cliente.SQLException_Exception;
import br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException;
import br.com.ronald.CepCliente.ConnectionApi;

public class CepService {
	
	public EnderecoERP consulta(String cep) throws SQLException_Exception, SigepClienteException {
		
		ConnectionApi connection = new ConnectionApi();
		AtendeCliente client = connection.makeclient();
		
		return client.consultaCEP(cep);
	}
	
}
