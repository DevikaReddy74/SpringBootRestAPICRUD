package com.cts.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
