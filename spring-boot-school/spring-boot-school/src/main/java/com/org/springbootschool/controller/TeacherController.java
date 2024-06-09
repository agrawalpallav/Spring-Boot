package com.org.springbootschool.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.org.springbootschool.dao.TeacherDao;
import com.org.springbootschool.dto.Teacher;

@RestController
public class TeacherController {
	
	@Autowired
	TeacherDao dao;
	
	@PostMapping("/teacher")
	public ResponseEntity<String> saveTeacher(@RequestBody Teacher t) {
		boolean res = dao.saveTeacher(t);
		if(res) {
			return ResponseEntity.of(Optional.of("success"));
		}else {
			return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
		}
	}
	
	@GetMapping("/teacher")
	public ResponseEntity<List<Teacher>> getAllTeachers(){
		List<Teacher> teachers = dao.getAllTeachers();
		if(teachers.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
		}else {
			return ResponseEntity.of(Optional.of(teachers));
		}
	}
	
	@GetMapping("/teacher/{id}")
	public ResponseEntity<Teacher> getTeacherById(@PathVariable int id){
		Teacher t= dao.findTeacherById(id);
		if(t!=null) {
			return ResponseEntity.of(Optional.of(t));
		}else {
			return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
		}
		
	}
	
	@DeleteMapping("/teacher/{id}")
	public ResponseEntity<String> deleteTeacherById(@PathVariable int id){
		boolean res = dao.deleteTeacher(id);
		if(res) {
			return ResponseEntity.of(Optional.of("delete successfully"));
		}else {
			return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
		}
	}
	
	@PatchMapping("/teacher")
	public ResponseEntity<String> updateTeacher(@RequestBody Teacher t) {
		boolean res = dao.updateTeacher(t);
		if(res) {
			return ResponseEntity.of(Optional.of("success"));
		}else {
			return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
		}
	}
	
}
