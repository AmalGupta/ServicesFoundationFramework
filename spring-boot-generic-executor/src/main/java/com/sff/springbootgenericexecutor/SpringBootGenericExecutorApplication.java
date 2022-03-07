package com.sff.springbootgenericexecutor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class SpringBootGenericExecutorApplication {

	public static void main(String[] args) {

		log.info("Starting Spring Boot Generic Executor");
		SpringApplication.run(SpringBootGenericExecutorApplication.class, args);

	}

}
