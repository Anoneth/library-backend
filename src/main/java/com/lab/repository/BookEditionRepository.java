package com.lab.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lab.data.BookEdition;

public interface BookEditionRepository extends JpaRepository<BookEdition, Integer> {

}
