package org.example.todolist.Repository;

import org.example.todolist.Model.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoRepository extends JpaRepository<ToDo, Long> {

}



