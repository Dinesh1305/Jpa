package com.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Course {
@Id
@GeneratedValue
private Integer c_id;
private String title;
private String description;
public Integer getC_id() {
	return c_id;
}
public void setC_id(Integer c_id) {
	this.c_id = c_id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
}
