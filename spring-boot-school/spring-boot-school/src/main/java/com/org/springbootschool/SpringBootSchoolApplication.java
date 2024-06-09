package com.org.springbootschool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.org.springbootschool.dto.Teacher;

@SpringBootApplication
public class SpringBootSchoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSchoolApplication.class, args);
		Teacher t = new Teacher();
		
	}

}
