package com.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "resources")
@Data
@EqualsAndHashCode(callSuper = true)
public class Resources  extends BaseClass  {

private String name;
private int size;
private String url;

@OneToOne 
private Lecture lecture;



}
