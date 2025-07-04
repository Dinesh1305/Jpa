package com.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Lecture  extends BaseClass  {

private String name;

@ManyToOne	
@JoinColumn(name="section_id")
private Section section;


@OneToOne 
private Resources resource;







}
