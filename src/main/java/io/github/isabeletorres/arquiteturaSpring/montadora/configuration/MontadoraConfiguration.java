package io.github.isabeletorres.arquiteturaSpring.montadora.configuration;

import io.github.isabeletorres.arquiteturaSpring.montadora.Motor;
import io.github.isabeletorres.arquiteturaSpring.montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MontadoraConfiguration {

    @Bean
    public Motor motot(){
        var motor = new Motor();
        motor.setCalavos(120);
        motor.setCilindros(4);
        motor.setModelo("XPTO-0");
        motor.setLitragem(2.0);
        motor.setTipo(TipoMotor.ASPIRADO);
        return motor;
    }
}
