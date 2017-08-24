package com.softwareag;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class FormValidator implements Validator {

	@Override
	public boolean supports(Class<?> arg0) {
		
		return true;
	}

	@Override
	public void validate(Object form, Errors error) {
		FormBean f=(FormBean)form;
		if(f.getName().equals(" "))
			error.reject("name","name is required");
		if(f.getEmail().equals(" "))
			error.reject("email","email is required");
	}

}
