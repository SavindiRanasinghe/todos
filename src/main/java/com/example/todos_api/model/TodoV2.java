package com.example.todos_api.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * The TodoV2 class ...
 *
 * @author Eric Opoku on 5/11/2019
 * @version 1.0
 * @since 1.0
 */
@Entity
public class TodoV2 {

  @Id
  private Long id;

  private String name;

  // Hibernate always require a no argument constructor.
  public TodoV2() {
  }

  public TodoV2(String name) {
    this.name = name;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TodoV2 todoV2 = (TodoV2) o;
    return getId().equals(todoV2.getId()) &&
            getName().equals(todoV2.getName());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getId(), getName());
  }

  @Override
  public String toString() {
    return "TodoV2{" +
            "id=" + id +
            ", name='" + name + '\'' +
            '}';
  }
}
