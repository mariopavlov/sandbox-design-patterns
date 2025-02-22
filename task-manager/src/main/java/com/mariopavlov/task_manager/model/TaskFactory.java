/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mariopavlov.task_manager.model;

/**
 *
 * @author mariopavlov
 */
public class TaskFactory {

    public static Task createTask(String title, String description) {
        var task = new Task();
        task.setTitle(title);
        task.setDescription(description);

        return task;
    }

}
