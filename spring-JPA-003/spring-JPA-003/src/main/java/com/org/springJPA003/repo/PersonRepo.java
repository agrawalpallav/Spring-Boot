package com.org.springJPA003.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.springJPA003.Person;

public interface PersonRepo extends JpaRepository<Person, Integer>{
	
}
