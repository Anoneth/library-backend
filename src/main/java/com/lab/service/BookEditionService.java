package com.lab.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lab.data.BookEdition;
import com.lab.repository.BookEditionRepository;

@Service
public class BookEditionService {
	
	@Autowired
	private BookEditionRepository bookEditionRepository;
	
	public BookEditionService(BookEditionRepository bookEditionRepository) {
		this.bookEditionRepository = bookEditionRepository;
	}
	
	public List<BookEdition> findAll() {
		return bookEditionRepository.findAll();
	}
	
	public BookEdition save(BookEdition bookEdition) {
		return bookEditionRepository.save(bookEdition);
	}
	
	public void delete(int id) {
		bookEditionRepository.deleteById(id);
	}

}
