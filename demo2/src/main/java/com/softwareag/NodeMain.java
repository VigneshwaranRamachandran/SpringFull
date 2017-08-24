package com.softwareag;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.softwareag.Node;

public class NodeMain extends Thread {

	static List<Object> l = new ArrayList<Object>();

	public static void main(String[] args) {
				l.add(new Date());
		// creating 5 nodes and store into List
		for (int j = 0; j < 10; j++) {
		//int j[]={0,1};
			l.add(new Node("node" + j));
			//l.add(new Node("node" + j[1]));
		}
		
			System.out.println("five nodes created sucessfully");

		// creating 5 threads and used to activate 5 nodes
		for (int i = 0; i <100000; i++) {
			Thread t = new NodeMain();
			t.start();
		}
		try{sleep(2000);
		checkDetails();
		}
		catch(Exception e){
			
		}
	}
	public static void	checkDetails(){
		l.add(new Date());
System.out.println("Starting time : "+l.get(0));
System.out.println("Ending time : "+l.get(l.size()-1));
	}

	public void run() {
//		for (int i = 1; i < 11; i++) {
//			try {
//				sleep(100);
//			} catch (InterruptedException e) {
//				
//				e.printStackTrace();
//			}
//			((Node) l.get(i)).hitAtomicInteger();
//			//((Node) l.get(2)).hitAtomicInteger();
//			
//		}
		((Node) l.get(1)).hitAtomicInteger();
		((Node) l.get(2)).hitAtomicInteger();
		((Node) l.get(3)).hitAtomicInteger();
		((Node) l.get(4)).hitAtomicInteger();
		((Node) l.get(5)).hitAtomicInteger();
		((Node) l.get(6)).hitAtomicInteger();
		((Node) l.get(7)).hitAtomicInteger();
		((Node) l.get(8)).hitAtomicInteger();
		((Node) l.get(9)).hitAtomicInteger();
		((Node) l.get(10)).hitAtomicInteger();
		
	}
}
