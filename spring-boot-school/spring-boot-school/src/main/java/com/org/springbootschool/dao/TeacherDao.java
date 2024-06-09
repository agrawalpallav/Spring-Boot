package com.org.springbootschool.dao;

import java.util.List;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.org.springbootschool.dto.Teacher;
import com.org.springbootschool.repository.TeacherRepo;

@Component
public class TeacherDao {
	
	@Autowired
	TeacherRepo repo;
	
	public boolean saveTeacher(Teacher t) {
		try {
			repo.save(t);
			return true;
		}catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
	
	public List<Teacher> getAllTeachers(){
		return repo.findAll();
	}
	
//	public Teacher findTeacherById(int id) {
//		return repo.findById(id).get();
//	}
	
	public Teacher findTeacherById(int id) {
		Optional<Teacher> o = repo.findById(id);
		if(o.isEmpty()) {
			return null;
		}
		else{
			return o.get();
		}
			
	}
	public boolean deleteTeacher(int id) {
		Teacher t = findTeacherById(id);
		if(t!=null) {
			repo.delete(t);
		}
		return false;
	}
	
	public boolean updateTeacher(Teacher t) {
		try {
			repo.save(t);
			return true;
		}catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
}
