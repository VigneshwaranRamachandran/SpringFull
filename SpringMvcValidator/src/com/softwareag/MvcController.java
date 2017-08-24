package com.softwareag;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;


public class MvcController extends SimpleFormController {
public MvcController(){
	setCommandName("form");
	setCommandClass(FormBean.class);
	setValidator(new FormValidator());
	setFormView("index");
}

@Override
	protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		FormBean f=(FormBean)command;
		System.out.println(f.getName());
		System.out.println(f.getEmail());
		return new ModelAndView("sucess");
	}
}
