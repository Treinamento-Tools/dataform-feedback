package br.tools.treinamento.ws;

import java.util.List;

import javax.ejb.Stateless;
import javax.jws.WebService;

import br.tools.treinamento.Question;
import br.tools.treinamento.QuestionService;

@Stateless
@WebService(serviceName = "QuestionWS", portName = "QuestionWS", targetNamespace = "http://treinamento.tools.br/bean/", endpointInterface = "br.tools.treinamento.ws.QuestionWS")
public class QuestionWS implements QuestionWSInterface {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8828537656855762368L;

	@Override
	public void load(List<Question> questions) {
		QuestionService ser = new QuestionService(); 
		
		ser.load(questions);
	}

}
