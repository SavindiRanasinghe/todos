package com.example.todos_api.bootstrap;

import com.example.todos_api.model.Todo;
import com.example.todos_api.model.TodoV2;
import com.example.todos_api.repository.TodoRepository;
import com.example.todos_api.repository.TodoV2Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * The DataLoader class populates the database with initial data.
 *
 * @author Eric Opoku on 5/11/2019
 * @version 1.0
 * @since 1.0
 */
@Component
public class DataLoader implements CommandLineRunner {

  private final TodoRepository todoRepository;
  private final TodoV2Repository todoV2Repository;

  @Autowired
  public DataLoader(TodoRepository todoRepository, TodoV2Repository todoV2Repository) {
    this.todoRepository = todoRepository;
    this.todoV2Repository = todoV2Repository;
  }

  /**
   * Callback used to run the bean.
   *
   * @param args incoming main method arguments
   * @throws Exception on error
   */
  @Override
  public void run(String... args) throws Exception {
    Todo todo = new Todo("Test");
    Todo todo2 = new Todo("Test 2");
    todoRepository.save(todo);
    todoRepository.save(todo2);

    TodoV2 todoV2 = new TodoV2("Test 2 for V2");
    todoV2.setId(2L);
    todoV2Repository.save(todoV2);
  }
}
