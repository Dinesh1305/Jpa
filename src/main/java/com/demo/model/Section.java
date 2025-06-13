package com.demo.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Section {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer p_id;
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
public Integer getP_id() {
	return p_id;
}
public void setP_id(Integer p_id) {
	this.p_id = p_id;
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
