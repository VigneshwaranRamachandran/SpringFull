package com.softwareag;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloworldController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
			String name=req.getParameter("type");
			Map<String, String> m=new HashMap<String, String>();
			m.put("msg", name);
		return new ModelAndView("sucess",m);
	}

}
