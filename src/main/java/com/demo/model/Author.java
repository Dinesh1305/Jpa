package com.demo.model;




import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@Entity
@EqualsAndHashCode(callSuper = true)
public class Author extends BaseClass {



@Column(
		name="f_name")
private  String firstName;
private String lastName;
@Column(
		unique=true
		)
private String  email;

@ManyToMany(mappedBy="authors")
List<Course>courses;



}
