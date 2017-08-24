package com.softwareag.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/boot")
public class MainControlle {
@RequestMapping("/hi")
	public String sayhi(){
		
		return "hi";
	}
@RequestMapping("/topics")
public List<Topic> allTopics(){
	
	return Arrays.asList(
			new Topic(1, "vignesh", "first id "),
			new Topic(2, "waran", "second id "),
			new Topic(3, "vigneshwaran", "third id ")
			);
}

}
