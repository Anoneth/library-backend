package com.lab.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lab.data.LibraryUser;

@Repository
public interface LibraryUserRepository extends JpaRepository<LibraryUser, Integer> {
	
	@Query(value = "SELECT lu.userID, userName, userPassport, userBDate, userAddress, count(inventoryNumber) "
			+ "FROM library_user lu LEFT JOIN copy_of_the_book cotb ON lu.userID = cotb.userID "
			+ "GROUP BY lu.userID", nativeQuery = true)
	public List<Object[]> getAll();

}
