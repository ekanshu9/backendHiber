package com.ekanshu.hibernate_many_to_many_bidirectional.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.ekanshu.hibernate_many_to_many_bidirectional.dao.StudentSubjectDao;
import com.ekanshu.hibernate_many_to_many_bidirectional.dto.Student;
import com.ekanshu.hibernate_many_to_many_bidirectional.dto.Subject;

public class StudnetSubjectInsertController {

	public static void main(String[] args) {
		StudentSubjectDao dao=new StudentSubjectDao();
		Subject subject1=new Subject(123, "Java", "James", 58456d);
		Subject subject2=new Subject(124, "C", "Danish-Ritchi", 5889d);
		List<Subject> subjects=new ArrayList<Subject>(Arrays.asList(subject1,subject2))	;
		
		Student student1=new Student(101, "Danish", "danish@gmail.com", 45646622, subjects);
		Student student2=new Student(102, "Manish", "manish@gmail.com", 154546446, subjects);
		List<Student> students=new ArrayList<Student>(Arrays.asList(student1,student2));
		dao.saveStudentSubjectDao(students, subjects);		
				

	}

}
