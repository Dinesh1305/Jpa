package com.demo.model;



import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class Course  extends BaseClass   {

private String title;
private String description;
@ManyToMany
@JoinTable(
	    name = "author_courses",
	    joinColumns = @JoinColumn(name = "course_id"),         
	    inverseJoinColumns = @JoinColumn(name = "author_id")   
	)
private List<Author>authors;

@OneToMany(mappedBy="course")
private List<Section>section;











public List<Author> getAuthors() {
	return authors;
}
public void setAuthors(List<Author> authors) {
	this.authors = authors;
}
public List<Section> getSection() {
	return section;
}
public void setSection(List<Section> section) {
	this.section = section;
}
public List<Author> getAuthor() {
	return authors;
}
public void setAuthor(List<Author> author) {
	this.authors = author;
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
