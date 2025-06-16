package com.demo.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Section  extends BaseClass  {

private String name;
private String sectionOrder;

@ManyToOne
@JoinColumn(name="section_course")
private Course course;

@OneToMany(mappedBy="section")

List<Lecture>lecture;



public Course getCourse() {
	return course;
}
public void setCourse(Course course) {
	this.course = course;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSectionOrder() {
	return sectionOrder;
}
public void setSectionOrder(String sectionOrder) {
	this.sectionOrder = sectionOrder;
}


}
