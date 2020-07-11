package com.ToyProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

@EnableAspectJAutoProxy		//AOP
@EnableAutoConfiguration
@SpringBootApplication
@PropertySource("common.properties")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
