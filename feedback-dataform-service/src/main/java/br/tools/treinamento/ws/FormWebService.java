package br.tools.treinamento.ws;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

import br.tools.treinamento.FormService;
import br.tools.treinamento.bean.Form;

@Stateless
@WebService(serviceName = "FormWebService", portName = "FormWebService", targetNamespace = "http://treinamento.tools.br/form/", endpointInterface = "br.tools.treinamento.ws.FormWebServiceLocal")
public class FormWebService implements FormWebServiceLocal {
    @EJB
    private FormService formService;

    @Override
    @WebMethod
    public void save(final Form form) {
        final br.tools.treinamento.entity.Form formEntity = new br.tools.treinamento.entity.Form();
        formEntity.setId(formEntity.getId());
        formEntity.setName(formEntity.getName());
        formService.save(formEntity);
    }
   
}
