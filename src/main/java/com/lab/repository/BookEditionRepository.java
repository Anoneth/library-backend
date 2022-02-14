package com.lab.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lab.data.BookEdition;

@Repository
public interface BookEditionRepository extends JpaRepository<BookEdition, Integer> {
	
	@Query(value = "SELECT be.beID, be.isbn, bookID, phID, beYear, count(inventoryNumber) "
			+ "FROM book_edition be LEFT JOIN copy_of_the_book cotb ON be.isbn = cotb.isbn "
			+ "GROUP BY be.beID, be.isbn, bookID, phID, beYear", nativeQuery = true)
	public List<Object[]> getAll();

}
