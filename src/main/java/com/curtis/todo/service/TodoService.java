package com.curtis.todo.service;

import com.curtis.todo.model.Todo;
import com.curtis.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    @Autowired
    private TodoRepository repo;

    public List<Todo> getAll() {
        return repo.findAll();
    }

    public Todo create(String title, String description) {
        Todo todo = Todo.builder().title(title).description(description).completed(false).build();
        return repo.save(todo);
    }

    public Todo toggle(Long id) {
        Todo todo = repo.findById(id).orElseThrow();
        todo.setCompleted(!todo.isCompleted());
        return repo.save(todo);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}