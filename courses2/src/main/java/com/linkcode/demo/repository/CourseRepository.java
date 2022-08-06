package com.linkcode.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.linkcode.demo.entity.Course;

public interface CourseRepository extends JpaRepository<Course,Integer>
{
	Course findByName(String name);

}
