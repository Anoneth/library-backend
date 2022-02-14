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

import com.lab.data.BookEdition;
import com.lab.service.BookEditionService;

@RestController
public class BookEditionController {
	@Autowired
	private BookEditionService bookEditionService;
	
	@GetMapping("/book-editions")
	public List<BookEdition> getAll() {
		return bookEditionService.findAll();
	}
	
	@PostMapping("/book-editions")
	public BookEdition update(@RequestBody BookEdition bookEdition) {
		return bookEditionService.save(bookEdition);
	}
	
	@PutMapping("/book-editions")
	public BookEdition add(@RequestBody BookEdition bookEdition) {
		System.out.println(bookEdition.getISBN());
		return bookEditionService.save(bookEdition);
	}
	
	@DeleteMapping("/book-editions/{id}")
	public void remove(@PathVariable int id) {
		bookEditionService.delete(id);
	}

}
