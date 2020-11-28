package com.lab.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lab.data.LibraryDepartment;
import com.lab.service.LibraryDepartmentService;

@RestController
public class LibraryDepartmentController {
	
	@Autowired
	private LibraryDepartmentService libraryDepartmentService;
	
	@GetMapping("/lib-deps")
	public List<LibraryDepartment> getAll() {
		return libraryDepartmentService.findAll();
	}
	
	@PostMapping("/lib-deps")
	public LibraryDepartment update(@RequestBody LibraryDepartment libraryDepartment) {
		return libraryDepartmentService.save(libraryDepartment);
	}
	
	@PutMapping("/lib-deps")
	public LibraryDepartment add(@RequestBody LibraryDepartment libraryDepartment) {
		return libraryDepartmentService.save(libraryDepartment);
	}
	
	@DeleteMapping("/lib-deps/{id}")
	public void remove(@RequestParam int id) {
		libraryDepartmentService.delete(id);
	}

}
