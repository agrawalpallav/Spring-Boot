package com.org.springbootschool.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.springbootschool.dto.Teacher;

public interface TeacherRepo extends JpaRepository<Teacher, Integer> {
	

}
