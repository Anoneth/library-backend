package com.lab.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lab.data.Author;
import com.lab.repository.AuthorRepository;

@Service
public class AuthorService {
	
	@Autowired
	private AuthorRepository authorRepository;
	
	public AuthorService(AuthorRepository authorRepository) {
		this.authorRepository = authorRepository;
	}
	
	public List<Author> findAll() {
		return authorRepository.findAll();
	}
	
	public Author findById(int id) {
		return authorRepository.findById(id).orElse(null);
	}
	
	public Author add(Author author) {
		Author res = authorRepository.save(author);
		return res;
	}
	
	public Author update(Author author) {
		Author tmp = authorRepository.findById(author.getAuthorID()).orElse(null);
		if (tmp != null) {
			tmp.setAuthorBDate(author.getAuthorBDate());
			tmp.setAuthorName(author.getAuthorName());
			tmp = authorRepository.save(tmp);
		}
		return tmp;
	}
	
	public void remove(int id) {
		authorRepository.deleteById(id);
	}
	

}
