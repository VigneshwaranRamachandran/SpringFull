package com.softwareag;

public class Node {

	
	private String name;
	public Node(){
		
	}
	public Node(String name){
		this.name=name;
		
	}
	public String getName() {
		return name;
	}
	
	public void hitAtomicInteger(){
		new AtomicIntegerClass(name);
	}
}
