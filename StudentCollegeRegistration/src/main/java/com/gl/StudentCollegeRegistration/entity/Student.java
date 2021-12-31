package com.gl.StudentCollegeRegistration.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "student")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

	// define fields

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;


	@Column(name="Name")
	private String name;


	@Column(name="Department")
	private String department;

	
	@Column(name="country")
	private String country;

	public Student()
	{
		
	}
	
	public Student(String Name, String Department, String country) {
		
		this.name = name;
		this.department = department;
		this.country = country;
	}

	
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDepartment() {
		return department;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", Name=" + name + ", Department=" + department +  ", country=" + country + "]";
	}

	public void setDepartment(String string) {
		// TODO Auto-generated method stub
		
	}
	
}