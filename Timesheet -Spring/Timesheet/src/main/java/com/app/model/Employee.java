package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp_data")
public class Employee {
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="phonenum")
	private String phonenum;
	
	@Column(name="designation")
	private String designation;
	
	@Column(name="age")
	private int age;
	
	@Column(name="empid")
	private int empid;
	
	@Column(name="gender")
	private String gender;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhonenum() {
		return phonenum;
	}

	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}


	




	public Employee() {
		super();
	}

	public Employee(int id, String name, String email, String password, String phonenum, String designation, int age,
			int empid, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.phonenum = phonenum;
		this.designation = designation;
		this.age = age;
		this.empid = empid;
		this.gender = gender;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}
	
	
	
	

}
