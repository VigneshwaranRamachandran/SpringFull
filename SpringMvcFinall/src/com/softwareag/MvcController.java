package com.softwareag;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class MvcController extends MultiActionController{

	public ModelAndView empreg(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
			String name=req.getParameter("name");
			String lastname=req.getParameter("lastname");
			Map<String, String> m=new HashMap<String, String>();
			m.put("name", name);
			m.put("lastname", lastname);
			System.out.println(name);
		return new ModelAndView("sucess",m);
	}
	public ModelAndView empupdate(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		String name=req.getParameter("name");
		String lastname=req.getParameter("lastname");
		Map<String, String> m=new HashMap<String, String>();
		m.put("name", name);
		m.put("lastname", lastname);
		m.put("field","<input type='button' value='ok'/>");
	return new ModelAndView("sucess",m);
}
	public ModelAndView reg(HttpServletRequest req, HttpServletResponse res) throws Exception {
		return new ModelAndView("reg");
}
	public ModelAndView update(HttpServletRequest req, HttpServletResponse res) throws Exception {
		return new ModelAndView("update");
}
}
