package com.example.taskmanager.tasks;

import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class TasksService {
    private final TasksRepository tasksRepository;


    public TasksService(TasksRepository tasksRepository) {
        this.tasksRepository = tasksRepository;
    }
    public TaskEntity createTask(String title, String descriptor, Date dueDate){
        TaskEntity task=new TaskEntity();
        task.setTitle(title);
        task.setDescription(descriptor);
        task.setDueDate(dueDate);
        return tasksRepository.save(task);
    }
}
