package com.example.librarymanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Librarymanagement{

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Librarymanagement.class, args);
		System.out.println("Library Management System is running!");
	}

}
