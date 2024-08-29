package com.todoapp.todoProject.service;

import com.todoapp.todoProject.entity.TaskEntity;

import java.util.List;
import java.util.Optional;

public interface TaskService {
    List<TaskEntity> getAllTasks();
    Optional<TaskEntity> getTaskById(Integer id);
    TaskEntity createNewTask(TaskEntity taskEntity);
    TaskEntity updateTask(TaskEntity taskEntity);
    void deleteTaskById(Integer id);
   List <TaskEntity> findByCompletedTrue();
   List<TaskEntity> findByCompletedFalse();


}
