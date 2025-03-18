package io.github.isabeletorres.arquiteturaSpring.montadora.api;

import org.springframework.beans.factory.annotation.*;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
@Qualifier
public @interface Aspirado {
}