package io.github.isabeletorres.arquiteturaSpring.todos;

import org.springframework.stereotype.*;

@Service
public class TodoService {


    private TodoRepository repository;
    private TodoValidator validator;
    private MailSender mailSender;

    public TodoService(TodoRepository todoRepository,
                       TodoValidator validator,
                       MailSender mailSender){
        this.repository = todoRepository;
        this.validator = validator;
        this.mailSender = mailSender;
    }

    public TodoEntity salvar(TodoEntity novoTodo){
        validator.validar(novoTodo);
        return repository.save(novoTodo);
    }

    public void atualizarStatus(TodoEntity todo){
        repository.save(todo);
        String status = todo.getConcluido() == Boolean.TRUE ? "Concluído" : "Não conclído";
        mailSender.enviar("Todo de código " + todo.getDescricao() + " foi atualizado para " + status);
    }
    public TodoEntity buscarId(Integer id){
        return repository.findById(id).orElse(null);
    }
}
