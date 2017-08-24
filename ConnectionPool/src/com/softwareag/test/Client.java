package com.softwareag.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.softwareag.business.StudentBo;
import com.softwareag.model.Student;

public class Client {
	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext cap=new ClassPathXmlApplicationContext("/com/softwareag/resource/sprin.xml");
		StudentBo stbo =(StudentBo) cap.getBean("bo");
		int i=stbo.createStudent(new Student(2,"vicky","tbm"));
		System.out.println(i);
		cap.close();
	}

}
