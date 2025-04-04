package com.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Resources {
@Id
private Integer id;
private String name;
private int size;
private String url;
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
