package com.linkcode.demo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name =" Courses")
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int C_id;
	
	@Column(name = "Name")
	private String name;
	
	@Column(name = "Description")
	private String description;
	
	public Course() {
		
	}
	
	public Course(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}
	
	
	
	//cascade-> whenever we save course entity into database ,along with course all students will be saved
	//one -> course & many -> students
	@OneToMany(cascade = CascadeType.ALL)  
	@JoinColumn(name = "c_fid", referencedColumnName = "C_id")
	List<Student> students = new ArrayList<>();	
	
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public int getId() {
		return C_id;
	}
	public void setId(int id) {
		this.C_id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	
}
