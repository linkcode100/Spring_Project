package com.linkcode.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.linkcode.demo.entity.Course;
import com.linkcode.demo.service.CourseService;
//annotate 
@RestController
public class CourseController {

	//this will talk to service ProductService class
	@Autowired
	private CourseService service;

	//write restend points for all methods present in service



	//post method
	//@PostMapping -> for post Api
	//@RequestBody so that input json can be parsed to this Product object
	@PostMapping("/addCourse")  //give url
	public Course addProduct(@RequestBody Course course) {
		return service.saveCourse(course);
	}

	@PostMapping("/addCourses")
	public List<Course> addCourses(@RequestBody List<Course> products) {
		return service.saveCourses(products);
	}



	@GetMapping("/courses")
	public List<Course> findAllProducts() {
		return service.getCourses();
	}

	//@PathVariable-> we need to pass id field as the part of request url ->also can use @RequestParameter
	@GetMapping("/courseById/{id}")
	public Course findCourseById(@PathVariable int id) {
		return service.getCourseById(id);
	}

	@GetMapping("/course/{name}")
	public Course findCourseByName(@PathVariable String name) {
		return service.getCourseByName(name);
	}

	@PutMapping("/update")
	public Course updateCourse(@RequestBody Course course) {
		return service.updateCourse(course);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteCourse(@PathVariable int id) {
		return service.deleteCourse(id);
	}


}
