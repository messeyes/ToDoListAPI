package org.example.todolist.Service;

import org.example.todolist.Model.ToDo;
import org.example.todolist.Repository.ToDoRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoService {
    private ToDoRepository toDoRepository;

    public void setToDoRepository(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }


    public List<ToDo> create(ToDo toDo){
        toDoRepository.save(toDo);
        return list();
    }

    public List<ToDo> list(){
        Sort sort = Sort.by("priority").descending().and(
                Sort.by("title").ascending()
        );
       return toDoRepository.findAll(sort);
    }

    public List<ToDo> update(ToDo todo){
        toDoRepository.save(todo);
        return list();
    }

    public List<ToDo> delete(Long id){
        toDoRepository.deleteById(id);
        return list();
    }
}
