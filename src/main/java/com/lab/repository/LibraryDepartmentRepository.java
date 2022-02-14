package com.lab.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lab.data.LibraryDepartment;

@Repository
public interface LibraryDepartmentRepository extends JpaRepository<LibraryDepartment, Integer> {
	
	@Query(value = "SELECT ld.departCode, departName, count(inventoryNumber) "
			+ "FROM library_department ld LEFT JOIN copy_of_the_book cotb ON ld.departCode = cotb.departCode "
			+ "GROUP BY ld.departCode", nativeQuery = true)
	public List<Object[]> getAll();

}
