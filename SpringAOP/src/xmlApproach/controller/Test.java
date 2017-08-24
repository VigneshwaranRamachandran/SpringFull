package xmlApproach.controller;

import org.apache.log4j.BasicConfigurator;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import xmlApproach.business.Bank;


public class Test {

	public static void main(String[] args) {
		BasicConfigurator.configure();
		
		ConfigurableApplicationContext cap=new ClassPathXmlApplicationContext("xmlApproach/resource/spring.xml");
		Bank bproxy=(Bank)cap.getBean("proxy");
		//int out2 = bproxy.deposite("SBI45", 5545);
		int out2 = bproxy.deposite("SBI123", 5000);
		System.out.println(out2);
	cap.close();
	}

}
