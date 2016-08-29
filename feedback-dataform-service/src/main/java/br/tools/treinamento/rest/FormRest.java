package br.tools.treinamento.rest;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
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

import br.tools.treinamento.FormService;
import br.tools.treinamento.bean.Form;

@Stateless
@Path("/form")
public class FormRest implements Serializable {
    @EJB
    private FormService formService;

    @Path("/")
    @GET // quando chamado via o m�todo GET
    @Produces("application/json") // Define o tipo de retorno
    public Response search() {

        final List<Form> forms = new ArrayList<Form>(); // form --bean
        for (br.tools.treinamento.entity.Form formEntity : formService.searchAll()) {
            Form formBean = new Form();
            formBean.setId(formEntity.getId());
            formBean.setName(formEntity.getName());
            forms.add(formBean);
        }
        return Response.ok(forms).build();
    }

    @Path("/{id}")
    @GET // quando chamado via o m�todo GET
    @Produces("application/json") // Define o tipo de retorno
    public Response find(@PathParam("id") String id) { // Uma alternativa seria
                                                       // utilizar
                                                       // @QueryParam("id")
                                                       // nesse caso, n�o �
                                                       // necess�rio
                                                       // o valor {id} no @Path
        return Response.ok(formService.find(id)).build();
    }

    @Path("/")
    @POST // quando chamado via o m�todo POST
    @Produces("application/json") // Define o tipo de retorno
    @Consumes("application/json") // Define o tipo de parametro que vir� do
                                  // cliente
    public Response create(Form form) {
        br.tools.treinamento.entity.Form formEntity = new br.tools.treinamento.entity.Form();
        formEntity.setId(form.getId());
        formEntity.setName(form.getName());
        return Response.ok(formService.create(formEntity)).build();
    }

    @Path("/")
    @PUT // quando chamado via o m�todo PUT
    @Produces("application/json") // Define o tipo de retorno
    @Consumes("application/json") // Define o tipo de parametro que vir� do
                                  // cliente
    public Response update(Form form) {
        br.tools.treinamento.entity.Form formEntity = new br.tools.treinamento.entity.Form();
        formEntity.setId(form.getId());
        formEntity.setName(form.getName());
        return Response.ok(formService.update(formEntity)).build();
    }

    @Path("/{id}")
    @DELETE // quando chamado via o m�todo DELETE
    @Produces("application/json") // Define o tipo de retorno
    @Consumes("application/json") // Define o tipo de parametro que vir� do
                                  // cliente
    public Response delete(@PathParam("id") String id) {
        formService.delete(id);
        return Response.ok().build();
    }

}
