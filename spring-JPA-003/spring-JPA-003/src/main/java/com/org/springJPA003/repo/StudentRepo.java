package com.org.springJPA003.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.springJPA003.dto.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>  {

}
