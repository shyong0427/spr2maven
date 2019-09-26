package pack.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("appinit.xml");
		
		SelectService service = (SelectService)context.getBean("selectServiceImpl");
		service.selectProcess();
	}
}