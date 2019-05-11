package com.example.todos_api.service;

import com.example.todos_api.model.Todo;

import java.util.List;

import org.springframework.stereotype.Service;

/**
 * The TodoService class holds all business logic about todo items.
 *
 * @author Eric Opoku on 5/11/2019
 * @since
 */
@Service
public interface TodoService {

  List<Todo> getAllTodoItems();

  Todo getTodoItemById(Long id);

  Todo getTodoItemByName(String name);

  Todo updateTodoItem(Todo todo);

  Todo saveTodoItem(Todo todo);

  boolean deleteTodoItem(Todo todo);

}
