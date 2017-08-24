package com.softwareag.business;

import com.softwareag.dao.StudentDao;
import com.softwareag.model.Student;

public class StudentBoImpl implements StudentBo {

	private StudentDao dao;
	
	
	
	public void setDao(StudentDao dao) {
		this.dao = dao;
	}

	@Override
	public int createStudent(Student st) throws Exception {
		// TODO Auto-generated method stub
		return dao.save(st);
	}

	@Override
	public int updateStudent(Student st) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteStudent(Student st) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
