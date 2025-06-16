package com.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "resources")
public class Resources  extends BaseClass  {

private String name;
private int size;
private String url;

@OneToOne 
private Lecture lecture;


public Lecture getLecture() {
	return lecture;
}
public void setLecture(Lecture lecture) {
	this.lecture = lecture;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSize() {
	return size;
}
public void setSize(int size) {
	this.size = size;
}
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}



}
