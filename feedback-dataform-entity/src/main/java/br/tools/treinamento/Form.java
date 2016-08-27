package br.tools.treinamento;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity (name = "FormEntity")
public class FormEntity implements Serializable{
	@Id
	@Column(name = "ID")
	private String id;
	@Column(name = "NAME")
	private String name;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}		
}