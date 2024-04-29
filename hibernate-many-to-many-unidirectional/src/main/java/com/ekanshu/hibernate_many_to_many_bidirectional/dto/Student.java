package com.ekanshu.hibernate_many_to_many_bidirectional.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	@Id
private int id;
private String name;
private String email;
private long phone;
@ManyToMany(cascade = CascadeType.PERSIST )
//@JoinTable(name = "student_subject",joinColumns = @JoinColumn(name="student_id"),inverseJoinColumns = @JoinColumn(name="subject_id"))
List<Subject> subjects;

}
