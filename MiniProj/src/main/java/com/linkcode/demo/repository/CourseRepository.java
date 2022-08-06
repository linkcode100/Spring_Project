package com.linkcode.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.linkcode.demo.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course,Integer>
{
	
	

}
