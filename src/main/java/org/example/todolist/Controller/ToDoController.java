package org.example.todolist.Controller;


import org.example.todolist.Model.ToDo;
import org.example.todolist.Service.ToDoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")

public class ToDoController {
    private ToDoService toDoService;

    public void ToDoController(ToDoService toDoService){
        this.toDoService = toDoService;
    }

    @PostMapping
    List<ToDo> create(@RequestBody ToDo toDo){
        return toDoService.create(toDo);
    }

    @GetMapping
    List<ToDo> list(){
        return toDoService.list();
    }

    @PutMapping
    List<ToDo> update(@RequestBody ToDo toDo){
        return toDoService.update(toDo);
    }

    @DeleteMapping("{id}")
    List<ToDo> delete(@PathVariable("id") Long id){
        return toDoService.delete(id);
    }

}
