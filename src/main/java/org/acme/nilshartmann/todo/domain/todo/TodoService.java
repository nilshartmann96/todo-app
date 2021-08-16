package org.acme.nilshartmann.todo.domain.todo;

import javax.enterprise.context.ApplicationScoped;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class TodoService {

    public List<Todo> getAllTodos() {
        Todo todoObject1 = new Todo();
        todoObject1.setTitle("Unit Tests schreiben");
        todoObject1.setDescription("Lorem ipsum dolor sit amet");
        todoObject1.setDueDate(LocalDateTime.of( 2021, Month.AUGUST, 18, 14, 30, 0 ));
        todoObject1.setStatus(Todo.Status.NOTDONE);

        Todo todoObject2 = new Todo();
        todoObject2.setTitle("Release fertigstellen");
        todoObject2.setDescription("Lorem ipsum dolor sit amet");
        todoObject2.setDueDate(LocalDateTime.of( 2021, Month.AUGUST, 20, 12, 0, 0 ));
        todoObject2.setStatus(Todo.Status.NOTDONE);

        List<Todo> todos = new ArrayList<>();
        todos.add(todoObject1);
        todos.add(todoObject2);

        return todos;
    }

}
