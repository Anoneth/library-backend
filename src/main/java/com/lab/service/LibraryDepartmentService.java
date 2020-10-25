package com.lab.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lab.data.LibraryDepartment;
import com.lab.repository.LibraryDepartmentRepository;

@Service
public class LibraryDepartmentService {
	
	@Autowired
	private LibraryDepartmentRepository libraryDepartmentRepository;
	
	public LibraryDepartmentService(LibraryDepartmentRepository libraryDepartmentRepository) {
		this.libraryDepartmentRepository = libraryDepartmentRepository;
	}
	
	public List<LibraryDepartment> findAll() {
		return libraryDepartmentRepository.findAll();
	}

}
