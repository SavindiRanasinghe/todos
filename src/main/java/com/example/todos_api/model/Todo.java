package com.example.todos_api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * The Todo class will server as a blueprint for all todo objects.
 *
 * @author Eric Opoku on 5/11/2019
 * @version 1.0
 * @since 1.0
 */
@Data // generate getters and setters for the fields.
@Entity
@ToString
@NoArgsConstructor
@EqualsAndHashCode(of = {"id", "name"})
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @NotBlank(message = "Name is required")
  @Size(min = 4, max = 25, message = "Todo item name character must be between 4 and 25")
  private String name;

  public Todo(@NotBlank(message = "Name is required") @Size(min = 4, max = 25, message = "Todo item name character must be between 4 and 25") String name) {
    this.name = name;
  }
}
