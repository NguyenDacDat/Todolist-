package com.todoapp.todoProject.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.scheduling.config.Task;

@Entity
@Data
@Table(name="task_table")
public class TaskEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String description;
    private String task;
    private boolean completed;
    public TaskEntity(){}
    public TaskEntity(int id, String description, String task, boolean completed) {
        this.id = id;
        this.description = description;
        this.task = task;
        this.completed = completed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
