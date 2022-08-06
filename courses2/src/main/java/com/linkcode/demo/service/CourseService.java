package com.linkcode.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.linkcode.demo.entity.Course;
import com.linkcode.demo.repository.CourseRepository;

@Service
public class CourseService 
{
	@Autowired
	private CourseRepository repository;
	
	//post methods to save object to database
	public Course saveCourse(Course course)
	{
		return repository.save(course);
	}
	
	public List<Course> saveCourses(List<Course> courses)
	{
		return repository.saveAll(courses) ;
		
	}
	
	//get methods
	public List<Course> getCourses()
	{
		return repository.findAll();
	}
	

    public Course getCourseById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Course getCourseByName(String name) {
        return repository.findByName(name);
    }
    
  //delete method
    public String deleteCourse(int id) {
        repository.deleteById(id);
        return "course removed !! " + id;
    }

   
    //there is no inbuilt method to update in spring data jpa -> use set methods
    public Course updateCourse(Course course) {
        Course existingCourse = repository.findById(course.getId()).orElse(null);
        existingCourse.setName(course.getName());
        existingCourse.setDescription(course.getDescription());
        existingCourse.setPrice(course.getPrice());
        existingCourse.setNoVideos(course.getNoVideos());
        return repository.save(existingCourse);
    }

	
}


