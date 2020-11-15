package com.lab.controller;

import java.security.Principal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lab.data.Author;
import com.lab.service.AuthorService;

@RestController
public class AuthorController {
	@Autowired
	private AuthorService authorService;
	
	@GetMapping("/authors")
	public List<Author> getAll() {
		return authorService.findAll();
	}
	
	@GetMapping("/authors/{id}")
	public Author getById(int id) {
		return authorService.findById(id);
	}
	
	@PostMapping("/authors")
	public Author edit(Author author) {
		return authorService.update(author);
	}
	
	@PutMapping("/authors")
	public Author update(Author author) {
		return authorService.update(author);
	}
	
	@DeleteMapping("/authors/{id}")
	public void delete(int id) {
		authorService.remove(id);
	}
	
	
	@RequestMapping("/user")
	public Principal user(Principal user) {
		return user;
	}

}
