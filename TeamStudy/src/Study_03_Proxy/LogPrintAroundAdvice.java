package Study_03_Proxy;

import java.util.Calendar;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class LogPrintAroundAdvice implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation method) throws Throwable {
		
		Log log = LogFactory.getLog(this.getClass());
		
		//보조 업무
		Calendar cal = Calendar.getInstance();
		log.info("금일 날짜 정보 : " + cal.getTime());
		//System.out.println(cal.getTime());
		
		//주업무
		String result = (String)method.proceed();
		
		
		//보조업무
		log.info("입력하신 문자의 길이 : " + result.length());
		//System.out.println("입력하신 문자의 길이 : " + result.length());
		
		return result;
	}

}
