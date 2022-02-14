package com.lab.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.lab.data.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {	
	
	@Query(value = "SELECT b.bookID, bookName, bookGenre, string_agg(cast(authorID as text), ','), count(be.isbn) "
			+ "FROM book b LEFT JOIN author_book ab ON b.bookID = ab.bookID "
			+ "LEFT JOIN book_edition be ON b.bookID = be.bookID "
			+ "GROUP BY b.bookID", nativeQuery = true)
	public List<Object[]> findAllWithAuthors();
	
	@Modifying
	@Transactional
	@Query(value = "DELETE FROM author_book WHERE bookID = :id ", nativeQuery = true)
	public void removeAuthors(@Param("id") int bookID);
	
	@Modifying
	@Transactional
	@Query(value = "INSERT INTO author_book VALUES (?2 , ?1 )", nativeQuery = true)
	public int addAuthor(int bookID, int authorID);
}
