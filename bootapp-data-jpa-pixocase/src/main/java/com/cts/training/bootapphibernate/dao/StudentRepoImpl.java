package com.cts.training.bootapphibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.cts.training.bootapphibernate.entity.Student;

public class StudentRepoImpl implements StudentCustom {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Student> getdata() {
		// TODO Auto-generated method stub
		return null;
	}

}
