package com.example.taskmanager.tasks;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@DataJpaTest
public class TasksServiceTest {
    private final TasksService tasksService;

    public TasksServiceTest(TasksService tasksService) {
        this.tasksService = tasksService;
    }
    @Autowired
    TasksRepository tasksRepository;
    @Test
    public  void testCreateTask(){
        TaskEntity task= tasksService.createTask(
                "Test Task",
                "Test Description",
                new Date()
        );


    }
}
