package io.github.isabeletorres.arquiteturaSpring.todos;

import org.springframework.stereotype.*;

@Component
public class MailSender {

    public void enviar(String mensagem){
        System.out.println("Enviado email: "+ mensagem);
    }
}
