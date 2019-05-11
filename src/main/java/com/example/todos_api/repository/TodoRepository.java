package com.example.todos_api.repository;

import com.example.todos_api.model.Todo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * The TodoRepository interface handles all crud operations to the todo items.
 *
 * @author Eric Opoku on 5/11/2019
 * @version 1.0
 * @since 1.0
 */
@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {

  @Override
  List<Todo> findAll();
}
