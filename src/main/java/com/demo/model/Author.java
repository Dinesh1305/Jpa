package com.demo.model;




import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@Entity
@Setter
@Getter
public class Author extends BaseClass {



@Column(
		name="f_name")
private @Setter String firstName;
private String lastName;
@Column(
		unique=true
		)
private String  email;

@ManyToMany(mappedBy="authors")
List<Course>courses;



}
