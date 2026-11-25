package com.taskapi.demo.controller;

import com.taskapi.demo.model.Task;
import com.taskapi.demo.service.TaskService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskController {
    public final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/api/task")
    public List<Task> getTasks() {
        return taskService.getAllTasks();
    }

    @PostMapping("/api/task")
    public Task createTask(@RequestBody Task task) {
        return taskService.createTask(task);
    }
}