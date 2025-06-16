package com.demo.model;




import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@Entity

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


public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}


}
