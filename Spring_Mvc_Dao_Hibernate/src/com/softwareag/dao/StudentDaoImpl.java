package com.softwareag.dao;

import java.util.List;

import org.springframework.orm.hibernate3.*;

import com.softwareag.model.Student;

public class StudentDaoImpl implements StudentDao {

	private HibernateTemplate ht;
	
	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}

	@Override
	public int save(Student st) {
		int i= (Integer)ht.save(st);
		return i;
	}

	@Override
	public boolean update(Student st)  {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Student st) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Student findById(int id)  {
		Student s=(Student) ht.get(Student.class,id);
		return s;
	}

	@Override
	public Student findByName(String name)  {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student findByAddress(String address)  {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> findAll()  {
		// TODO Auto-generated method stub
		return null;
	}

}
