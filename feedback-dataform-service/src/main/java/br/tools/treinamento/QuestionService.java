package br.tools.treinamento;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class QuestionService implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @PersistenceContext
    private EntityManager entityManager;

    public void load(final List<Question> questions) {

        for (final Question question : questions) {
            entityManager.persist(question);
        }
    }
}
