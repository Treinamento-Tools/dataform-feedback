package br.tools.treinamento;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class FormService implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 3853015604167051102L;

    @PersistenceContext
    private EntityManager entityManager;

    public Form save(final Form form) {
        entityManager.merge(form);
        return form;

    }
    
    public List<Form> searchAll() {
        return entityManager.createQuery("SELECT form FROM Form form", Form.class)
        					.getResultList();
    }
    
    public Form find(String id) {
        return entityManager.find(Form.class, id);
    }
    
    public Form create(Form form) {
        entityManager.persist(form);
        return form;
    }
    
    public Form update(Form form) {
        entityManager.persist(form);
        return form;
    }
    
    public void delete(String id) {
    	Form form = find(id);
        entityManager.remove(form);
    }
}
