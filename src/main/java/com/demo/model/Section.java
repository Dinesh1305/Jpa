package com.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Section {
@Id
private Integer p_id;
private String name;
private String sectionOrder;
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
