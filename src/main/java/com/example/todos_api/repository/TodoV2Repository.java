package com.example.todos_api.repository;

import com.example.todos_api.model.TodoV2;

import org.springframework.data.repository.CrudRepository;

/**
 * The TodoV2Repository class ...
 *
 * @author Eric Opoku on 5/11/2019
 * @since
 */
public interface TodoV2Repository extends CrudRepository<TodoV2, Long> {
}
