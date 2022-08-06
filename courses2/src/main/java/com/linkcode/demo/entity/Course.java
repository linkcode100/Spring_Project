package com.linkcode.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="course_tbl")
public class Course 
{
	 @Id
	 @GeneratedValue
	 private int id;
	 private String name;
	 private String description;
	 private int noVideos;
	 private float price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getNoVideos() {
		return noVideos;
	}
	public void setNoVideos(int noVideos) {
		this.noVideos = noVideos;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	 

}
