package com.linkcode.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name ="Student")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int S_id;
	
	@Column(name = "Name")
	private String name;

	@OneToOne(fetch = FetchType.LAZY , cascade=CascadeType.ALL) 
	@JoinColumn(name = "A_id")  //gives foreign key
	private Address address;
	
	public Student() {
		
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Student(String name1 , Address address1) {
		super();
		this.name= name1;
		this.address=address1;
	}
	
	public int getS_id() {
		return S_id;
	}
	public void setS_id(int s_id) {
		S_id = s_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
