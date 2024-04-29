package com.ekanshu.hibernate_many_to_many_bidirectional.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor@AllArgsConstructor
public class Subject {
	@Id
private int id;
private String name; 
private String author;
 private double price;
 
 @ManyToMany(mappedBy = "subjects")
 private List<Student> students;

public Subject(int id, String name, String author, double price) {
	super();
	this.id = id;
	this.name = name;
	this.author = author;
	this.price = price;
}
 
}
