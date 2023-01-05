package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleDemoApp {

	public static void main(String[] args) {
	
		//Load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		
		//Retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class); //Load from Interface
		
		System.out.println(theCoach.getDailyWorkout());
		context.close();
	}
	

}
