package com.lab.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lab.data.CopyOfTheBook;

@Repository
public interface CopyOfTheBookRepository extends JpaRepository<CopyOfTheBook, Integer> {
	
	@Query(value = "", nativeQuery = true)
	public List<Object[]> getAll();

}
