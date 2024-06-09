package com.org.springbootschool.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;


@Data
@Entity
public class Teacher {
	
	@Id
	private int id;
	private String name;
	private String gender;
	@Column(unique = true)
	private String subject;

}
