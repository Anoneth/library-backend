package com.lab.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lab.data.LibraryDepartment;

public interface LibraryDepartmentRepository extends JpaRepository<LibraryDepartment, Integer> {

}
