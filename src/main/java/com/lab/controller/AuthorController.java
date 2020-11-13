package com.lab.controller;

import java.security.Principal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
	
	@PostMapping("/authors.get")
	@ResponseBody
	public List<Author> getAll(@RequestBody Integer id) {
		if (id != -1) {
			Author result = authorService.findAll(id).orElse(null);
			if (result != null) return Arrays.asList(result);
		}
		return authorService.findAll();
	}
	@GetMapping("authors")
	@ResponseBody
	public Map<String, Object> test() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("id", UUID.randomUUID());
		model.put("content", "h123");
		return model;
	}
	
	@RequestMapping("/user")
	public Principal user(Principal user) {
		return user;
	}

}
