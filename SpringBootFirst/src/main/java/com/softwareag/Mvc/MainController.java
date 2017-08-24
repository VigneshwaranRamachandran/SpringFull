package com.softwareag.Mvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.softwareag.Mvc.TopicService;


@RestController
@RequestMapping("/bootmain")
public class MainController {
	
@RequestMapping("/hi")
	public String sayhi(){
		
		return "hi";
	}
@Autowired
private TopicService topicservice;
@RequestMapping("/topics")
public List<Topics> allTopics(){
	
	return topicservice.getAllDetails();
}
@RequestMapping("/topics/{id}")
public Topics getId(@PathVariable int id){
	return topicservice.getId(id);
}
@RequestMapping(method=RequestMethod.POST,value="/topics")
public void addTopic(@RequestBody Topics topic){
	topicservice.add(topic);
}
@RequestMapping(method=RequestMethod.PUT,value="/topics/{id}")
public void updateTopic(@RequestBody Topics topic,@PathVariable int id){
	topicservice.updateTopic(id, topic);
}
@RequestMapping(method=RequestMethod.DELETE,value="/topics/{id}")
public void deleteTopic(@PathVariable int id){
	topicservice.deleteTopic(id);
}
}
