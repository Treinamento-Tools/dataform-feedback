package br.tools.treinamento;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Form {
	@Id
	@Column
	private long id;
	@Column
	private String name;
	
	
	
	public boolean save(){
		
		
		return false;
	}
	

}
