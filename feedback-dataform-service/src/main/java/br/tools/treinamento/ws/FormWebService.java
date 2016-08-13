package br.tools.treinamento.ws;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

import br.tools.treinamento.FormEntity;
import br.tools.treinamento.FormService;
import br.tools.treinamento.bean.Form;

@Stateless
@WebService(serviceName="FormWebService"
, portName="FormWebService"
, targetNamespace="http://treinamento.tools.br/form/"
, endpointInterface="http://treinamento.tools.br/FormWebServiceLocal/")
public class FormWebService implements FormWebServiceLocal{
	@EJB
	private FormService formService;
	
	@WebMethod
	public void save(Form form){
		FormEntity formEntity = new FormEntity();
		formEntity.setId(formEntity.getId());
		formEntity.setName(formEntity.getName());
		
		formService.save(formEntity);
	}
	      

}
