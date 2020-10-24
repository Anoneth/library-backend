package com.lab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.lab.service.BookService;

@SpringBootApplication
public class Application {
	
	@Autowired
	private BookService bookService;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@EventListener(ApplicationReadyEvent.class)
	private void test() {
		bookService.findAll().forEach(book -> System.out.println(book.getBookName()));
	}

}
