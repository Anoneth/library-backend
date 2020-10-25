package com.lab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lab.data.BookEdition;

@Repository
public interface BookEditionRepository extends JpaRepository<BookEdition, Integer> {

}
