package xmlApproach.service;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import programaticApproach.business.Bank;

public class LogBeforeAndAfter implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		Log l=	LogFactory.getLog(Bank.class);
		l.info("before deposite");
		Object ret=mi.proceed();
	
		l.info("after deposite"+ret);

		return ret;
	}

}
