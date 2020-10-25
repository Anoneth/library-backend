package com.lab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lab.data.CopyOfTheBook;

@Repository
public interface CopyOfTheBookRepository extends JpaRepository<CopyOfTheBook, Integer> {

}
