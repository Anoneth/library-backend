package com.lab.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lab.data.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {
	
	@Query(value = "SELECT a.authorID, authorName, authorBDate, count(bookID) as book_count "
			+ "FROM author a LEFT JOIN ("
			+ "SELECT book.bookID, authorID "
			+ "FROM book INNER JOIN author_book ON book.bookID = author_book.bookID) t "
			+ "ON a.authorID = t.authorID "
			+ "GROUP BY a.authorID", nativeQuery = true)
	public List<Object[]> findAllWithCount();
}
