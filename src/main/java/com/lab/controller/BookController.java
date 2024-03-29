package com.lab.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lab.data.Book;
import com.lab.service.BookService;

@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping("/books")
	public List<Book> getAll() {
		return bookService.findAll();
	}
	
	@GetMapping("/books/{id}")
	public Book getById(@PathVariable int id) {
		return bookService.findById(id).orElse(null);
	}
	
	@GetMapping("/books/authors")
	public List<Book> getAllWithAuthors() {
		return bookService.findAllWithAuthors();
	}
	
	@PostMapping("/books")
	public Book update(@RequestBody Book book) {
		return bookService.save(book);
	}

	@PutMapping("/books")
	public Book add(@RequestBody Book book) {
		return bookService.save(book);
	}
	
	@DeleteMapping("/books/{id}")
	public void remove(@PathVariable int id) {
		bookService.deleteById(id);
	}

}
