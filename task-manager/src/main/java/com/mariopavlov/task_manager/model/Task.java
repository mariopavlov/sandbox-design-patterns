/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mariopavlov.task_manager.model;

import java.time.LocalDateTime;
import java.util.UUID;

import com.mariopavlov.task_manager.TaskState;

/**
 *
 * @author mariopavlov
 */
public class Task {
    private final String id;
    private String Title;
    private String Description;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;
    private LocalDateTime Due;
    private TaskState State;

    public Task() {
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        this.Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        this.Description = description;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public LocalDateTime getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(LocalDateTime updated_at) {
        this.updated_at = updated_at;
    }

    public LocalDateTime getDue() {
        return Due;
    }

    public void setDue(LocalDateTime due) {
        this.Due = due;
    }

    public TaskState getState() {
        return State;
    }

    public void setState(TaskState state) {
        this.State = state;
    }
}
