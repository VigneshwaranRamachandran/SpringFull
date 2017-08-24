package com.softwareag.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.softwareag.dao.StudentDaoImpl;
import com.softwareag.model.Student;

public class Client {
	public static void main(String[] args) throws Exception {
		
		ConfigurableApplicationContext cap=new ClassPathXmlApplicationContext("/com/softwareag/resource/sprin.xml");
		StudentDaoImpl stdao =(StudentDaoImpl) cap.getBean("dao");
		Student s=new Student();
		s.setId(1);
		s.setName("vicky");
		s.setEmail("vickymail");
		int i=stdao.save(s);
		System.out.println(i);
		cap.close();
	}

}
