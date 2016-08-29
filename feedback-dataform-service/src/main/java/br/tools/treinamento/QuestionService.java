package br.tools.treinamento;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.tools.treinamento.bean.Question;

@Stateless
public class QuestionService implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@PersistenceContext
	private EntityManager entityManager;

	public void load(final List<br.tools.treinamento.entity.Question> questions) {

		for (br.tools.treinamento.entity.Question question : questions) {
			entityManager.persist(question);
		}
	}

	public List<Question> searchAll() {
		return entityManager.createQuery(" SELECT q FROM Question q", Question.class).getResultList();
	}

	public Object findById(Long id) {
		return entityManager.find(Question.class, id);
	}

	public void delete(Long id) {
		entityManager.remove(entityManager.find(Question.class, id));
	}

	public Question create(Question question) {
		entityManager.persist(question);
		return question;
	}

	public Question update(Question question) {
		return entityManager.merge(entityManager.find(Question.class, question.getId()));
	}
}
