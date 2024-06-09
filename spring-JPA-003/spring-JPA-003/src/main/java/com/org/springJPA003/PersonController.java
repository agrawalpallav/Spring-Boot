package com.org.springJPA003;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.org.springJPA003.repo.PersonRepo;

@RestController
public class PersonController {
	
	@Autowired
	PersonRepo repo;
	
	@PostMapping("/person")
	public String savePerson(@RequestBody Person p) {
		repo.save(p);
		return "DATA SAVED";
		
	}
	
	@GetMapping("/person")
	public List<Person> getAllPersons(){
		return repo.findAll();	
	}
	
	@GetMapping("/person/{id}")
	public Person getPersonById(@PathVariable int id) {
		Optional<Person> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}
		return null;
	}
	
	@DeleteMapping("/person/{id}")
	public String deletePersonById(@PathVariable int id) {
		Optional<Person> opt = repo.findById(id);
		if(opt.isPresent()) {
			repo.delete(opt.get());
			return "Delete Successfully";
		}
		return "No data with specified id";
	}
	
}
