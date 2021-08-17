package org.acme.nilshartmann.todo.domain.todo;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Todo implements Serializable {

    enum Status {
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

}