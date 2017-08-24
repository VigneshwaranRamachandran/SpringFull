package com.softwareag;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	// inject via application.properties
	@Value("${welcome.message}")
	private String message = "Hello World";
	
	@Value("${welcome.header}")
	private String header ="";
	
	@Value("${welcome.footer}")
	private String footer ="";
	
	

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("message", this.message);
		return "welcome";
	}
	@RequestMapping("/5xx")
	public String ServiceUnavailable(Map<String, Object> model) {
		model.put(header, this.header);
		model.put(footer, this.footer);
		throw new RuntimeException("ABC");
	}
}
