package io.github.isabeletorres.arquiteturaSpring.todos;

import org.springframework.stereotype.*;

@Service
public class TodoService {

    private TodoRepository repository;

    public TodoService(TodoRepository todoRepository){
        this.repository = todoRepository;
    }
    public TodoEntity salvar(TodoEntity novoTodo){
        return repository.save(novoTodo);
    }

    public void atualizarStatus(TodoEntity todo){
        repository.save(todo);
    }
    public TodoEntity buscarId(Integer id){
        return repository.findById(id).orElse(null);
    }
}
