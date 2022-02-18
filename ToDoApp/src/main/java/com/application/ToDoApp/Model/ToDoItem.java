package com.application.ToDoApp.Model;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ToDoItem {

    private long id;
    @NotNull
    private String title;
    private boolean isDone;

    public ToDoItem() {
    }

    public ToDoItem(long id, String title, boolean isDone) {
        this.id = id;
        this.title = title;
        this.isDone = isDone;
    }

    @Id
    @GeneratedValue
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }
}
