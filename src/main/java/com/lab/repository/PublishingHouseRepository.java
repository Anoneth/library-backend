package com.lab.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lab.data.PublishingHouse;

@Repository
public interface PublishingHouseRepository extends JpaRepository<PublishingHouse, Integer> {
	
	@Query(value = "SELECT ph.phID, phName, phAddress, count(isbn) "
			+ "FROM publishing_house ph LEFT JOIN book_edition be ON ph.phID = be.phID "
			+ "GROUP BY ph.phID", nativeQuery = true)
	public List<Object[]> getAll();
}
