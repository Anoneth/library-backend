package com.lab.service;

import java.math.BigInteger;
import java.util.ArrayList;
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
		List<BookEdition> result = new ArrayList<BookEdition>();
		List<Object[]> response = bookEditionRepository.getAll();
		for (Object[] o : response) {
			BookEdition be = new BookEdition();
			be.setBeID((int)o[0]);
			be.setISBN(o[1].toString());
			be.setBookId((int)o[2]);
			be.setPhID((int)o[3]);
			be.setBeYear((int)o[4]);
			be.setCount(((BigInteger)o[5]).intValue());
			result.add(be);
		}
		return result;
	}
	
	public BookEdition save(BookEdition bookEdition) {
		return bookEditionRepository.save(bookEdition);
	}
	
	public void delete(int id) {
		bookEditionRepository.deleteById(id);
	}

}
