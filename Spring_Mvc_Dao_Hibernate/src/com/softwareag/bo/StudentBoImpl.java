package com.softwareag.bo;

import com.softwareag.dao.StudentDao;
import com.softwareag.model.Student;

public  class StudentBoImpl  implements StudentBoInterface {

	private StudentDao stdo;

	
	public void setStdo(StudentDao stdo) {
		this.stdo = stdo;
	}

	@Override
	public int createStudent(Student st) {
		
		return stdo.save(st);
	}

	@Override
	public Student find(int id) {
		// TODO Auto-generated method stub
		return stdo.findById(id);
	}
	
	
}
