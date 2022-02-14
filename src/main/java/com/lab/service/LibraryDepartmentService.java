package com.lab.service;

import java.math.BigInteger;
import java.util.ArrayList;
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
		List<LibraryDepartment> result = new ArrayList<LibraryDepartment>();
		List<Object[]> response = libraryDepartmentRepository.getAll();
		for (Object[] o : response) {
			LibraryDepartment ld = new LibraryDepartment();
			ld.setDepartCode((int)o[0]);
			ld.setDepartName(o[1].toString());
			ld.setCount(((BigInteger)o[2]).intValue());
			result.add(ld);
		}
		return result;
	}
	
	public LibraryDepartment save(LibraryDepartment libraryDepartment) {
		return libraryDepartmentRepository.save(libraryDepartment);
	}
	
	public void delete(int id) {
		libraryDepartmentRepository.deleteById(id);
	}
}
