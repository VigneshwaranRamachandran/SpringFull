package xmlApproach.service;

import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.MethodBeforeAdvice;

import programaticApproach.business.Bank;

public class LogBefore implements MethodBeforeAdvice {

	@Override
	public void before(Method m, Object[] param, Object o) throws Throwable {
	Log l=	LogFactory.getLog(Bank.class);
	l.info("before deposite");
	}

}
