package com.practice.todoServerSecond;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;

@SpringBootApplication
public class TodoServerSecondApplication {

	public static void main(String[] args) {

		SpringApplication.run(TodoServerSecondApplication.class, args);
		LocalDateTime dueDate = LocalDateTime.now();
		System.out.println(dueDate);
	}

}
