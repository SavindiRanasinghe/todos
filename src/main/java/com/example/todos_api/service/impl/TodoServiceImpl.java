package com.example.todos_api.service.impl;

import com.example.todos_api.model.Todo;
import com.example.todos_api.repository.TodoRepository;
import com.example.todos_api.service.TodoService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The TodoServiceImpl class ...
 *
 * @author Eric Opoku on 5/11/2019
 * @since
 */
@Service
public class TodoServiceImpl implements TodoService {

  private final TodoRepository todoRepository;

  @Autowired
  public TodoServiceImpl(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  @Override
  public List<Todo> getAllTodoItems() {
    return todoRepository.findAll();
  }

  @Override
  public Todo getTodoItemById(Long id) {
    Optional<Todo> repositoryById = todoRepository.findById(id);
    return repositoryById.orElse(null);
  }

  @Override
  public Todo getTodoItemByName(String name) {
    return null;
  }

  @Override
  public Todo updateTodoItem(Todo todo) {
    return null;
  }

  @Override
  public Todo saveTodoItem(Todo todo) {
    return null;
  }

  @Override
  public boolean deleteTodoItem(Todo todo) {
    return false;
  }
}
