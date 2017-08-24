package programaticApproach.controller;

import org.apache.log4j.BasicConfigurator;
import org.springframework.aop.framework.ProxyFactoryBean;

import programaticApproach.business.Bank;
import programaticApproach.service.LogAfter;
import programaticApproach.service.LogBefore;
import programaticApproach.service.LogBeforeAndAfter;
import programaticApproach.service.LogWithException;
public class Test {

	public static void main(String[] args) {
		BasicConfigurator.configure();
		//target object
		Bank b = new Bank();
		//service objects
		LogBefore lo = new LogBefore();
		LogAfter la = new LogAfter();
		LogBeforeAndAfter lba = new LogBeforeAndAfter();
		LogWithException lwe =new LogWithException();
		//creating proxy object 
		ProxyFactoryBean pfb = new ProxyFactoryBean();
		pfb.setTarget(b);
		pfb.addAdvice(lwe);
		//casting proxy to parent business class object
		Bank bproxy = (Bank) pfb.getObject();
		//int out = bproxy.deposite("SBI123", 5000);
		int out2 = bproxy.deposite("SBI45", 5545);
		System.out.println(out2);
	}

}
