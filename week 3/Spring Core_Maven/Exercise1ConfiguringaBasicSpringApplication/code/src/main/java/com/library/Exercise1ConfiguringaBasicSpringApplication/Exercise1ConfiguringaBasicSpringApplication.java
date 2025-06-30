package com.library.Exercise1ConfiguringaBasicSpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Exercise1ConfiguringaBasicSpringApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		Bookservice bookservice =  (Bookservice) context.getBean("bookservice");
		BookRepository bookRepository = (BookRepository) context.getBean("bookRepository");
		bookservice.setbookRepository(bookRepository);
		 bookservice.addbook("Spring in Action");
	}

}
