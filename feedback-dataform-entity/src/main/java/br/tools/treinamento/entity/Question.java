package br.tools.treinamento.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "QUESTION")
public class Question implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "field_id")
    private Integer fieldId;

    @Column(name = "question")
    private String question;

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     *            the id to set
     */
    public void setId(final String id) {
        this.id = id;
    }

    /**
     * @return the fieldId
     */
    public Integer getFieldId() {
        return fieldId;
    }

    /**
     * @param fieldId
     *            the fieldId to set
     */
    public void setFieldId(final Integer fieldId) {
        this.fieldId = fieldId;
    }

    /**
     * @return the question
     */
    public String getQuestion() {
        return question;
    }

    /**
     * @param question
     *            the question to set
     */
    public void setQuestion(final String question) {
        this.question = question;
    }

    /**
     * @return the serialversionuid
     */
    public static long getSerialversionuid() {
        return Question.serialVersionUID;
    }

}
