package com.todoapp.todoProject.service;

import com.todoapp.todoProject.entity.TaskEntity;
import com.todoapp.todoProject.exception.BadCreateTaskException;
import com.todoapp.todoProject.exception.TaskNotFoundException;
import com.todoapp.todoProject.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class TaskServiceImplement implements TaskService{
    private TaskRepository taskRepository;

    public TaskServiceImplement(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }
    @Override
    public List<TaskEntity> findByCompletedTrue() {
        return taskRepository.findByCompletedTrue();
    }

    @Override
    public List<TaskEntity> findByCompletedFalse() {
        return taskRepository.findByCompletedFalse();
    }

    @Override
    public List<TaskEntity> getAllTasks() {
        return taskRepository.findAll();
    }

    @Override
    public Optional<TaskEntity> getTaskById(Integer id) {
        Optional<TaskEntity> optionalTaskEntity = taskRepository.findById(Long.valueOf(id));
        if(optionalTaskEntity.isPresent()){
            return Optional.of(optionalTaskEntity.get());
        }
        throw new TaskNotFoundException();
    }

    @Override
    public TaskEntity createNewTask(TaskEntity taskEntity) {
        return taskRepository.save(taskEntity);
    }

    @Override
    public TaskEntity updateTask(TaskEntity taskEntity) {
        return taskRepository.save(taskEntity);
    }

    @Override
    public void deleteTaskById(Integer id) {
        taskRepository.deleteById(Long.valueOf(id));
        throw new BadCreateTaskException();
    }
}
