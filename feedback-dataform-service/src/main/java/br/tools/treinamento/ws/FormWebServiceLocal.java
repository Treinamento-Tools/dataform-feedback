package br.tools.treinamento.ws;

import javax.ejb.Local;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.persistence.Column;

import br.tools.treinamento.Form;

@Local
@WebService(serviceName = "FormWS", portName = "FormWS", targetNamespace = "http://treinamento.tools.br/form/")
public interface FormWebServiceLocal {
	@WebResult(name="FormTo", targetNamespace="http://treinamento.tools.br/form/")
    @WebMethod
	public Form save (
			@WebParam(name="Name",targetNamespace="http://treinamento.tools.br/form/") String name, 
	        @WebParam(name="Id",targetNamespace="http://treinamento.tools.br/form/") String id); 	
}
