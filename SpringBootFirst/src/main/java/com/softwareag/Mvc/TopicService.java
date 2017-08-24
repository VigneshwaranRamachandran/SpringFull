package com.softwareag.Mvc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class TopicService {
	
	private List<Topics> topics= new ArrayList<>(Arrays.asList(
			new Topics(1, "vignesh", "first id "),
			new Topics(2, "waran", "second id "),
			new Topics(3, "vigneshwaran", "third id ")
			));
	public List<Topics> getAllDetails(){
		return topics;
	}
	public Topics getId(int id) {
		
		return  (Topics) topics.stream().filter(t -> t.getId()==(id)).findFirst().get();
	}
	public void add(Topics topic){
		topics.add(topic);
	}
	public void updateTopic(int id,Topics topic){
		for(int i=0;i<topics.size();i++){
			Topics t =topics.get(i);
			if(t.getId()==id){
				topics.set(i, topic);
			}
		}
	}
	public void deleteTopic(int id) {
		topics.removeIf(t -> t.getId()==id);
		
	}
}
