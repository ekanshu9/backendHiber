package com.ekanshu.hibernate_many_to_many_bidirectional.controller;

import java.util.ArrayList;
import java.util.List;

import com.ekanshu.hibernate_many_to_many_bidirectional.dto.Subject;

public class CountSubjectController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Subject> subjects=new ArrayList<Subject>();
	  long count=subjects.stream().filter(a->a.getName()=="Java").count();

	}

}
