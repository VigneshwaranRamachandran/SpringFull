package com.softwareag.Mvc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class TopicService {
	@Autowired
	private TopicsRepository topicRepo;
	public List<Topics> getAllDetails(){
		List<Topics> l=new ArrayList<>();
		topicRepo.findAll().forEach(l::add);
		return l;
	}
	public Topics getId(int id) {
		return 	topicRepo.findOne(id);
	}
	public void add(Topics topic){
		topicRepo.save(topic);
	}
	public void updateTopic(int id,Topics topic){
		topicRepo.save(topic);
	}
	public void deleteTopic(int id) {
		topicRepo.delete(id);
		
	}
}
