package br.tools.treinamento.ws;

import java.io.Serializable;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

import br.tools.treinamento.Form;

@Stateless
@WebService(serviceName="FormWebService"
, portName="FormWebService"
, targetNamespace="http://treinamento.tools.br/FormWebService/"
, endpointInterface="http://treinamento.tools.br/FormWebService/")
public class FormWebService implements Serializable{
	
	@WebMethod
	public Form save(String name, String id){
		Form form = new Form();
		form.setId(id);
		form.setName(name);
		
		return form;
	}
	      

}
