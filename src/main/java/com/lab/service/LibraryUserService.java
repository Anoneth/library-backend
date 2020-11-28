package com.lab.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lab.data.LibraryUser;
import com.lab.repository.LibraryUserRepository;

@Service
public class LibraryUserService {
	
	@Autowired
	private LibraryUserRepository libraryUserRepository;
	
	public LibraryUserService(LibraryUserRepository libraryUserRepository) {
		this.libraryUserRepository = libraryUserRepository;
	}
	
	public List<LibraryUser> findAll() {
		return libraryUserRepository.findAll();
	}
	
	public LibraryUser save(LibraryUser libraryUser) {
		return libraryUserRepository.save(libraryUser);
	}
	
	public void delete(int id) {
		libraryUserRepository.deleteById(id);
	}

}
