package com.lab.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lab.data.Book;
import com.lab.repository.BookRepository;

@Service
public class BookService {
	@Autowired
	private BookRepository bookRepository;
	
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	public List<Book> findAll() {
		return bookRepository.findAll();
	}
	
	public List<Book> findAllWithAuthors() {
		List<Book> books = new ArrayList<Book>();
		List<Object[]> response = bookRepository.findAllWithAuthors();
		for (int i = 0; i < response.size(); i++) {
			Book book = new Book();
			Object[] o = response.get(i);
			book.setBookID((int)o[0]);
			book.setBookName(o[1].toString());
			book.setBookGenre(o[2].toString());
			if (o[3] != null) {
				String[] t = o[3].toString().split(",");
				int[] tm = new int[t.length];
				for (int j = 0; j < tm.length; j++) {
					tm[j] = Integer.parseInt(t[j]);
				}
				book.setBookAuthors(tm);
			} else {
				book.setBookAuthors(null);
			}
			books.add(book);
		}
		return books;
	}
	
	public void updateAuthorsById(int id, int[] authors) {
		System.out.println(id);
		bookRepository.removeAuthors(id);
		for (int i : authors) {
			bookRepository.addAuthor(id, i);
		}
	}
	
	public Optional<Book> findById(int id) {
		return bookRepository.findById(id);
	}
	
	public Book save(Book book) {
		Book result = bookRepository.save(book);
		updateAuthorsById(book.getBookID(), book.getBookAuthors());
		result.setBookAuthors(book.getBookAuthors());
		return result;
	}
	
	public void deleteById(int id) {
		bookRepository.removeAuthors(id);
		bookRepository.deleteById(id);
	}
}
