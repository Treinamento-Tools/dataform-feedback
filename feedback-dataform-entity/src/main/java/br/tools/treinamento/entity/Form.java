package br.tools.treinamento.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FORM")
public class Form implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID")
    private String id;
    @Column(name = "NAME")
    private String name;

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }
}
