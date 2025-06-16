package com.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Lecture  extends BaseClass  {

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

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
