package com.org.springboot001;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
	@RequestMapping("/msg")
	public String getMsg() {
		return "java language";
	}
	@RequestMapping("/std")
	public Student getStudent() {
		Student s = new Student();
		s.setRoll(101);
		s.setName("abc");
		s.setAge(24);
		return s;
	}
	@RequestMapping("/stds")
	public List<Student> getStudents(){
		Student s1 = new Student();
		s1.setRoll(101);
		s1.setName("aaa");
		s1.setAge(24);
		
		Student s2 = new Student();
		s2.setRoll(102);
		s2.setName("bbb");
		s2.setAge(19);
		
		Student s3 = new Student();
		s3.setRoll(103);
		s3.setName("ccc");
		s3.setAge(20);
		
		List<Student> students = new ArrayList<>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		return students;
	}
	@RequestMapping("/poststd")
	public String postStudent(@RequestBody Student s) {
		System.out.println(s.getRoll());
		System.out.println(s.getName());
		System.out.println(s.getAge());
		
		return "success";
	}
}
