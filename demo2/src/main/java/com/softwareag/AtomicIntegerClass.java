package com.softwareag;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerClass {

	private static AtomicInteger aint =new AtomicInteger();
	public AtomicIntegerClass(){
		
	}
	public AtomicIntegerClass(String name){
		aint.incrementAndGet();
		System.out.println(name+" : "+aint.get());
	}
	
}
