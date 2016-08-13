package br.tools.treinamento.ws;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Local;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import br.tools.treinamento.Question;

@Local
@WebService(serviceName = "QuestionWSInterface", portName = "QuestionWSInterface", targetNamespace = "http://treinamento.tools.br/bean/")
public interface QuestionWSInterface extends Serializable {

	@WebMethod
	public void load(@WebParam(name = "questions", targetNamespace = "http://treinamento.tools.br/bean/") List<Question> questions);

}
