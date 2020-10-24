package com.lab.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lab.data.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
