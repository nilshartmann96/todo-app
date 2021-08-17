package org.acme.nilshartmann.todo.domain;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
public class TodoServiceTest {

    @Inject
    TodoService todoService;

    @Test
    @DisplayName("Check if todo list is returned as expected.")
    void correctTodosReturned() {
        List<Todo> todos = createTodosForComparison();
        assertEquals(todos, todoService.getAllTodos());
    }

    private List<Todo> createTodosForComparison() {
        Todo todoObject1 = new Todo();
        todoObject1.setTitle("Unit Tests schreiben");
        todoObject1.setDescription("Lorem ipsum dolor sit amet.");
        todoObject1.setDueDate(LocalDateTime.of( 2021, Month.AUGUST, 18, 14, 30, 0 ));
        todoObject1.setStatus(Todo.Status.NOTDONE);

        Todo todoObject2 = new Todo();
        todoObject2.setTitle("Release fertigstellen");
        todoObject2.setDescription("Lorem ipsum dolor sit amet.");
        todoObject2.setDueDate(LocalDateTime.of( 2021, Month.AUGUST, 20, 12, 0, 0 ));
        todoObject2.setStatus(Todo.Status.NOTDONE);

        return List.of(todoObject1, todoObject2);
    }

}
