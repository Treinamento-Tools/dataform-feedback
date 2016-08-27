package br.tools.treinamento.ws;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Local;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import br.tools.treinamento.bean.Question;

@Local
@WebService(targetNamespace = "http://treinamento.tools.br/question/")
public interface QuestionWSInterface extends Serializable {

	@WebMethod
	public void load(@WebParam(name = "questions", targetNamespace = "http://treinamento.tools.br/bean/") List<Question> questions);

}
