package com.demo.model;



import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
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







}
