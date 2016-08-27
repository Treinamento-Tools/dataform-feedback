package br.tools.treinamento.bean;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "Form")
@XmlAccessorType(XmlAccessType.FIELD)
public class Form implements Serializable{

	private static final long serialVersionUID = 1L;
	@XmlElement(name = "id")
	private String id;
	@XmlElement(name = "name")
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
