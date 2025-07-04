package com.demo.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Section  extends BaseClass  {

private String name;
private String sectionOrder;

@ManyToOne
@JoinColumn(name="section_course")
private Course course;

@OneToMany(mappedBy="section")

List<Lecture>lecture;






}
