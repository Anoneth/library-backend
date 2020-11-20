package com.lab.service;

import java.math.BigInteger;
import java.sql.Date;
import java.util.ArrayList;
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
	
	public List<Author> findAllWithCount() {
		List<Author> result = new ArrayList<Author>();
		List<Object[]> authors = authorRepository.findAllWithCount();
		for (int i = 0; i < authors.size(); i++) {
			result.add(new Author());
			result.get(i).setAuthorID((int)authors.get(i)[0]);
			result.get(i).setAuthorName((String)authors.get(i)[1]);
			result.get(i).setAuthorBDate((Date)authors.get(i)[2]);
			result.get(i).setBookCount((BigInteger)authors.get(i)[3]);
		}
		return result;
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
