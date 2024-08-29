package com.todoapp.todoProject.controller;

import com.todoapp.todoProject.entity.TaskEntity;
import com.todoapp.todoProject.exception.BadCreateTaskException;
import com.todoapp.todoProject.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/tasks")
@CrossOrigin(origins = "http://localhost:5173/")
public class TaskController {
    @Autowired
    private  TaskService taskService;
    @GetMapping("/")
   public ResponseEntity<List<TaskEntity>> getAllTasks(){
        return ResponseEntity.ok().body(taskService.getAllTasks());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<TaskEntity>>getTaskById(@PathVariable Integer id) {
        return ResponseEntity.ok().body(taskService.getTaskById(id));
    }
    @PostMapping("/createTasks")
    public TaskEntity createNewTask(@RequestBody TaskEntity taskEntity){
       return ResponseEntity.ok(taskService.createNewTask(taskEntity)).getBody();
    }
    @PutMapping("/updateTask")
    public TaskEntity updateTask(@RequestBody TaskEntity taskEntity){
        return ResponseEntity.ok().body(taskService.updateTask(taskEntity)).getBody();
    }
    @DeleteMapping("/{id}")
    ResponseEntity<Boolean> deleteTaskById(@PathVariable Integer id){
        taskService.deleteTaskById(id);
        return ResponseEntity.ok(true);
    }
    @GetMapping("/completed")
    public ResponseEntity<List<TaskEntity>> getAllCompletedTasks(){
        return ResponseEntity.ok().body(taskService.findByCompletedTrue());
    }
    @GetMapping("/uncompleted")
    public ResponseEntity<List<TaskEntity>> getAllUncompleteTasks(){
        return ResponseEntity.ok().body(taskService.findByCompletedFalse());
    }


}
