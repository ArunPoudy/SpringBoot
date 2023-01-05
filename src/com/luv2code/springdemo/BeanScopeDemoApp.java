package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
	
		//Load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		
		//Retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class); //Load from Interface
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		// Check if they are same
		boolean result = (theCoach==alphaCoach);
		System.out.println("If they are same: " + result);
		System.out.println("Memory loc of theCoach" + theCoach);
		System.out.println("Memory loc of alphaCoach" + alphaCoach);
		
		context.close();
	}
	

}
