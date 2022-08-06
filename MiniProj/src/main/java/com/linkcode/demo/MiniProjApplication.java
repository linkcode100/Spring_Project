package com.linkcode.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.linkcode.demo.entity.Address;
import com.linkcode.demo.entity.Course;
import com.linkcode.demo.entity.Student;
import com.linkcode.demo.repository.AddressRepository;
import com.linkcode.demo.repository.CourseRepository;
import com.linkcode.demo.repository.StudentRepository;


//CommandLineRumnner gives run method
@SpringBootApplication
public class MiniProjApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(MiniProjApplication.class, args);
	}

	@Autowired
	private CourseRepository courseRepository;
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private AddressRepository addressRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Course courseObj = new Course("Java","Laern core concepts of java");
		
		Student student1 = new Student();
		student1.setName("Akanksha");
		Student student2 = new Student();
		student2.setName("Chinmayi");
		Student student3 = new Student();
		student3.setName("Sakshi");
		
		
		Address address1 = new Address();
		address1.setCity("Ahmednagar");
		address1.setArea("Shivaji Nagar");
		address1.setStreet("Beed Road");
		address1.setPinCode(413201);
		
		Address address2 = new Address();
		address2.setCity("Baramati");
		address2.setArea("Taware Bunglow");
		address2.setStreet("Bhigwan Road");
		address2.setPinCode(413133);
	
		Address address3 = new Address();
		address3.setCity("Pune");
		address3.setArea("Karve Nagar");
		address3.setStreet("Karve Road");
		address3.setPinCode(411052);
		
		
		student1.setAddress(address1);
		student2.setAddress(address2);
		student3.setAddress(address3);
		
		//getStudents() gives student list
		courseObj.getStudents().add(student1);
		courseObj.getStudents().add(student2);
		courseObj.getStudents().add(student3);
		
		//We have used CascadeType.ALL so when we store course, its's students also get saved to database
		this.courseRepository.save(courseObj);
		this.studentRepository.save(student1);
		this.studentRepository.save(student2);
		this.studentRepository.save(student3);
		
	}

}
