package com.softwareag.controller;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.softwareag.bo.StudentBoInterface;
import com.softwareag.model.Student;


@WebServlet({ "/EmpSaveController", "/empsave" })
public class EmpSaveController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ConfigurableApplicationContext cap;
	@Override
	public void init() throws ServletException
	{
 cap=new ClassPathXmlApplicationContext("/com/softwareag/resource/sprin.xml");	
 
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		String name=(req.getParameter("name"));
		String email=(req.getParameter("email"));
		String address=(req.getParameter("address"));
		//send data to business part
		StudentBoInterface bo = (StudentBoInterface)cap.getBean("bo");
		Student st=new Student();
		st.setId(id);
		st.setEmail(email);
		st.setName(name);
		st.setAddress(address);
		Student v;
		int v1=bo.createStudent(st);
		v=bo.find(st.getId());
		System.out.println(v1);
		System.out.println(v.getName());
		System.out.println(v.getEmail());
		System.out.println(v.getAddress());
	}
	@Override
	public void destroy() {
		cap.close();
	}
	
	

}
