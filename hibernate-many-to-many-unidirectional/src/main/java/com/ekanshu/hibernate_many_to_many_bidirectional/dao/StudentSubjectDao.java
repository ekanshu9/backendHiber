package com.ekanshu.hibernate_many_to_many_bidirectional.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.border.EtchedBorder;

import com.ekanshu.hibernate_many_to_many_bidirectional.dto.Student;
import com.ekanshu.hibernate_many_to_many_bidirectional.dto.Subject;


public class StudentSubjectDao {
	EntityManager eManager=Persistence.createEntityManagerFactory("ekanshu").createEntityManager();
	EntityTransaction entityTransaction=eManager.getTransaction();
	public List<Student> saveStudentSubjectDao(List<Student> students,List<Subject> subjects) {
		
		entityTransaction.begin();
		for(Student student:students) {
			eManager.persist(student);
		}
		
		entityTransaction.commit();
		return students;
	}

}
