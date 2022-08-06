package com.linkcode.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "Address")
public class Address 
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int A_id;
	private String city;
	private String street;
	private String area;
	private int pinCode;
	public int getA_id() {
		return A_id;
	}
	public void setA_id(int a_id) {
		A_id = a_id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	
	public Address()
	{
		
	}
	
	
	public Address(String city, String street, String area, int pinCode) {
		super();
		this.city = city;
		this.street = street;
		this.area = area;
		this.pinCode = pinCode;
	}


}
