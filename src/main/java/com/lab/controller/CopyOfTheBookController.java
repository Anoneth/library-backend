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

import com.lab.data.CopyOfTheBook;
import com.lab.service.CopyOfTheBookService;

@RestController
public class CopyOfTheBookController {
	
	@Autowired
	private CopyOfTheBookService copyOfTheBookService;
	
	@GetMapping("/cotbs")
	public List<CopyOfTheBook> getAll() {
		return copyOfTheBookService.findAll();
	}
	
	@PostMapping("/cotbs")
	public CopyOfTheBook update(@RequestBody CopyOfTheBook copyOfTheBook) {
		return copyOfTheBookService.save(copyOfTheBook);
	}
	
	@PutMapping("/cotbs")
	public CopyOfTheBook add(@RequestBody CopyOfTheBook copyOfTheBook) {
		return copyOfTheBookService.save(copyOfTheBook);
	}
	
	@DeleteMapping("/cotbs/{id}")
	public void remove(@PathVariable int id) {
		copyOfTheBookService.delete(id);
	}

}
