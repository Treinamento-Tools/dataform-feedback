package br.tools.treinamento.ws;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;

import br.tools.treinamento.QuestionService;
import br.tools.treinamento.bean.Question;

@Stateless
@WebService(serviceName = "QuestionWS"
, portName = "QuestionWS"
, targetNamespace = "http://treinamento.tools.br/question/"
, endpointInterface = "br.tools.treinamento.ws.QuestionWSInterface")
public class QuestionWS implements QuestionWSInterface {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8828537656855762368L;
	
	@EJB
	private QuestionService ser;
	
	@Override
	public void load(List<Question> questions) {
		  
		List<br.tools.treinamento.Question> listQ = new ArrayList<br.tools.treinamento.Question>();
		
		for (Question question : questions) {
			br.tools.treinamento.Question q = new br.tools.treinamento.Question();
			
			q.setFieldId(question.getFieldId());
			q.setId(question.getId());
			q.setQuestion(question.getQuestion());
			listQ.add(q);
		}
		
		this.ser.load(listQ);
	}

}
