package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public class Alien {
	
	
	
	public Alien() {
		super();
		System.out.println("Object Created");
	}


	private int aid;
	private String aname;
	private String tech;
	@Autowired //Now alien object will search for the object of type Laptop -> if @Qualifier is not mentioned //This will connect with the object created by spring
	@Qualifier("lap1")  //this will tell spring to check for object named lap1
	private Laptop laptop;   //Alien class is dependent on Laptop class
	
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	
	
	void show()
	{
		System.out.println("IN Alien Class");
		laptop.compile();
	}

}
