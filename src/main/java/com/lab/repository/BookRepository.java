package com.lab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lab.data.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}
