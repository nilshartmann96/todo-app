package org.acme.nilshartmann.todo.domain;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

public class Todo implements Serializable {

    public enum Status {
        DONE,
        NOTDONE
    }

    private String title;
    private String description;
    private LocalDateTime dueDate;
    private Status status;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Todo todo = (Todo) o;
        return title.equals(todo.title) && description.equals(todo.description) && dueDate.equals(todo.dueDate) && status == todo.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, description, dueDate, status);
    }
}