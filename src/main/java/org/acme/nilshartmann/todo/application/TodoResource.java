package org.acme.nilshartmann.todo.application;

import org.acme.nilshartmann.todo.domain.TodoService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/todo")
@Produces(MediaType.APPLICATION_JSON)
public class TodoResource {

    @Inject
    TodoService todoService;

    @GET
    public Response showAllTodos() {
        return Response.ok(this.todoService.getAllTodos()).build();
    }

}