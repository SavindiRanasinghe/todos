package com.example.todos_api.controller;

import com.example.todos_api.model.Todo;
import com.example.todos_api.service.TodoService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The TodoController class ...
 *
 * @author Eric Opoku on 5/11/2019
 * @since
 */
@RestController
@RequestMapping(path = "/todos")
public class TodoController {

  private final TodoService todoService;

  @Autowired
  public TodoController(TodoService todoService) {
    this.todoService = todoService;
  }

  @GetMapping
  public List<Todo> getAllTodos() {
    return todoService.getAllTodoItems();
  }

  @GetMapping(path = "/{id}")
  public Todo getTodo(@PathVariable Long id){
    return todoService.getTodoItemById(id);
  }
}
