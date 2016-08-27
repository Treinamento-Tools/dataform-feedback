package br.tools.treinamento.ws;

import javax.ejb.Local;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import br.tools.treinamento.bean.Form;

@Local
@WebService(targetNamespace = "http://treinamento.tools.br/form/")
public interface FormWebServiceLocal {
    @WebMethod
    public void save(@WebParam(name = "Form", targetNamespace = "http://treinamento.tools.br/bean/") Form form);
}
