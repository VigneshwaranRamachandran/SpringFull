package pointinXmlApproach.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.ThrowsAdvice;

import pointinXmlApproach.business.Bank;

public class LogWithException implements ThrowsAdvice {
public void afterThrowing(Exception ex){
	Log l = LogFactory.getLog(Bank.class);
	l.info("incase of exception in deposite : "+ex.getMessage());
}
}
