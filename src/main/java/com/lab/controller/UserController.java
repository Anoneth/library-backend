package com.lab.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lab.data.LibraryUser;
import com.lab.service.LibraryUserService;

@RestController
public class UserController {
	
	@Autowired
	private LibraryUserService libraryUserService;
	
	@GetMapping("/users")
	public List<LibraryUser> getAll() {
		return libraryUserService.findAll();
	}
	
	@PostMapping("/users")
	public LibraryUser update(@RequestBody LibraryUser libraryUser) {
		return libraryUserService.save(libraryUser);
	}
	
	@PutMapping("/users")
	public LibraryUser add(@RequestBody LibraryUser libraryUser) {
		return libraryUserService.save(libraryUser);
	}

	@DeleteMapping("/users/{id}")
	public void remove(@PathVariable int id) {
		libraryUserService.delete(id);
	}
	
	@RequestMapping("/user")
	public Principal user(Principal user) {
		return user;
	}
}
