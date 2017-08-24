package programaticApproach.service;

import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.AfterReturningAdvice;

import programaticApproach.business.Bank;

public class LogAfter implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object ret, Method m, Object[] param, Object o) throws Throwable {
		Log l=	LogFactory.getLog(Bank.class);
		l.info("after deposite"+ret);

		
	}

}
