package Study_02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		/*ElectronicStore store = new ElectronicStore();
		System.out.println(store.toString());*/
		
		ApplicationContext context = 
				new GenericXmlApplicationContext("classpath:Study_02/ApplictationContext.xml");
		
		ElectronicStore store = context.getBean("electronicStore", ElectronicStore.class);
		
		System.out.println(store.toString());
	}

}
