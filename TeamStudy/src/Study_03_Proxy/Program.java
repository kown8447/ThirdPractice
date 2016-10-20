package Study_03_Proxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Program {

	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("classpath:Study_03_Proxy/ApplicationContext.xml");
		Output output = (Output)context.getBean("proxy");
		String result = output.strout();
		System.out.println("입력값 : " + result);
	}

}
