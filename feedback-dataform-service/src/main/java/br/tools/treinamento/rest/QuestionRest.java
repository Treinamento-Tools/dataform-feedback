package br.tools.treinamento.rest;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import br.tools.treinamento.QuestionService;
import br.tools.treinamento.bean.Question;

@Stateless
@Path("/question")
public class QuestionRest implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -7371352048092236794L;

    @Path("/question")
    @GET
    @Produces("application/json")
    public Response search() {
        QuestionService questionService = new QuestionService();

        final List<br.tools.treinamento.entity.Question> questions = new ArrayList<br.tools.treinamento.entity.Question>();

        for (Question questionBean : questionService.searchAll()) {
            br.tools.treinamento.entity.Question questionEntity = new br.tools.treinamento.entity.Question();
            questionEntity.setId(questionBean.getId());
            questionEntity.setFieldId(questionBean.getFieldId());
            questionEntity.setQuestion(questionBean.getQuestion());
            questions.add(questionEntity);
        }

        return Response.ok(questions).build();
    }

    @Path("/question/{id}")
    @GET
    @Produces("application/json")
    public Response find(@PathParam("id") Long id) {
        QuestionService questionService = new QuestionService();

        Question questionBean = (Question) questionService.findById(id);
        br.tools.treinamento.entity.Question questionEntity = new br.tools.treinamento.entity.Question();

        questionEntity.setId(questionBean.getId());
        questionEntity.setFieldId(questionBean.getFieldId());
        questionEntity.setQuestion(questionBean.getQuestion());

        return Response.ok(questionEntity).build();
    }

    @Path("/{id}")
    @DELETE
    @Produces("application/json")
    @Consumes("application/json")
    public Response delete(@PathParam("id") Long id) {
        QuestionService questionService = new QuestionService();
        questionService.delete(id);

        return Response.ok().build();
    }

    @Path("/")
    @POST
    @Produces("application/json")
    @Consumes("application/json")
    public Response create(Question question) {
        QuestionService questionService = new QuestionService();

        Question questionBean = (Question) questionService.create(question);
        br.tools.treinamento.entity.Question questionEntity = new br.tools.treinamento.entity.Question();

        questionEntity.setId(questionBean.getId());
        questionEntity.setFieldId(questionBean.getFieldId());
        questionEntity.setQuestion(questionBean.getQuestion());

        return Response.ok(questionEntity).build();
    }

    @Path("/")
    @PUT
    @Produces("application/json")
    @Consumes("application/json")
    public Response update(Question question) {
        QuestionService questionService = new QuestionService();

        Question questionBean = (Question) questionService.update(question);
        br.tools.treinamento.entity.Question questionEntity = new br.tools.treinamento.entity.Question();

        questionEntity.setId(questionBean.getId());
        questionEntity.setFieldId(questionBean.getFieldId());
        questionEntity.setQuestion(questionBean.getQuestion());

        return Response.ok(questionEntity).build();
    }

}
