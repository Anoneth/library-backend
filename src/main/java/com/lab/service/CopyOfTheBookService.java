package com.lab.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lab.data.CopyOfTheBook;
import com.lab.repository.CopyOfTheBookRepository;

@Service
public class CopyOfTheBookService {
	
	@Autowired
	private CopyOfTheBookRepository copyOfTheBookRepository;
	
	public CopyOfTheBookService(CopyOfTheBookRepository copyOfTheBookRepository) {
		this.copyOfTheBookRepository = copyOfTheBookRepository;
	}
	
	public List<CopyOfTheBook> findAll() {
		return copyOfTheBookRepository.findAll();
	}
	
	public CopyOfTheBook save(CopyOfTheBook copyOfTheBook) {
		return copyOfTheBookRepository.save(copyOfTheBook);
	}
	
	public void delete(int id) {
		copyOfTheBookRepository.deleteById(id);
	}

}
