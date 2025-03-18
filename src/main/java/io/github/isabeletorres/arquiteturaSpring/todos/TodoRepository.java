package io.github.isabeletorres.arquiteturaSpring.todos;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

@Repository
public interface TodoRepository extends JpaRepository<TodoEntity, Integer>{
    boolean existsByDescricao(String descricao);
}
