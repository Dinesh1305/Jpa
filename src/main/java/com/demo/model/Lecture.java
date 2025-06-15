package com.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Lecture {
@Id 
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer id;
private String name;

@ManyToOne	
@JoinColumn(name="section_id")
private Section section;


@OneToOne 
private Resources resource;







public Section getSection() {
	return section;
}
public void setSection(Section section) {
	this.section = section;
}
public Resources getResource() {
	return resource;
}
public void setResource(Resources resource) {
	this.resource = resource;
}
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

}
