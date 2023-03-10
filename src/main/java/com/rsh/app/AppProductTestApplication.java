package com.rsh.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages={"com.rsh"})
@EntityScan("com.rsh")
@EnableJpaRepositories("com.rsh")
public class AppProductTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppProductTestApplication.class, args);
	}

}
