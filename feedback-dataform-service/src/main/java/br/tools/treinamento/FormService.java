package br.tools.treinamento;

import java.io.Serializable;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class FormService implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3853015604167051102L;
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public Form save(Form form){		
		entityManager.merge(form);
		return form;
		
	}

}
