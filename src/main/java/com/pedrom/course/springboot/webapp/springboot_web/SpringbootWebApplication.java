package com.pedrom.course.springboot.webapp.springboot_web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

//Se agrega en una clase ValuesConfig, para ser mas independiente
/*@PropertySources(
	{
		@PropertySource("classpath:values.properties")
	}
)*/

public class SpringbootWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootWebApplication.class, args);
	}

}
