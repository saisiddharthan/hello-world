package com.application.controller;

public class User {
	
	Integer id;
	String name;
	String dept;
	String location;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", dept=" + dept + ", location=" + location + "]";
	}
	
	

}
