package io.github.isabeletorres.arquiteturaSpring;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class ArquiteturaSpringApplication {

	public static void main(String[] args) {

		//SpringApplication.run(ArquiteturaSpringApplication.class, args);
		SpringApplicationBuilder builder = new SpringApplicationBuilder(ArquiteturaSpringApplication.class);
		builder.bannerMode(Banner.Mode.OFF);
		builder.run(args);
	}

}
