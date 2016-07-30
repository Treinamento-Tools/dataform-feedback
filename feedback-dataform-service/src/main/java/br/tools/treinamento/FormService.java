package br.tools.treinamento;

import java.io.Serializable;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class FormService implements Serializable{
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public Form save(Form form){		
		entityManager.merge(form);
		return form;
		
	}

}
