package io.github.isabeletorres.arquiteturaSpring.todos;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<TodoEntity, Integer>{
}
