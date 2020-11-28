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

import com.lab.data.Author;
import com.lab.service.AuthorService;

@RestController
public class AuthorController {
	@Autowired
	private AuthorService authorService;
	
	@GetMapping("/authors")
	public List<Author> getAll() {
		return authorService.findAllWithCount();
	}
	
	@GetMapping("/authors/{id}")
	public Author getById(@PathVariable int id) {
		return authorService.findById(id);
	}
	
	@PostMapping("/authors")
	public Author update(@RequestBody Author author) {
		return authorService.update(author);
	}
	
	@PutMapping("/authors")
	public Author add(@RequestBody Author author) {
		return authorService.add(author);
	}
	
	@DeleteMapping("/authors/{id}")
	public void delete(@PathVariable int id) {
		authorService.remove(id);
	}
}
