package com.softwareag.business;

import com.softwareag.model.Student;

public interface StudentBo {

	public int createStudent(Student st)throws Exception;
	public int updateStudent(Student st)throws Exception;
	public int deleteStudent(Student st)throws Exception;
}
