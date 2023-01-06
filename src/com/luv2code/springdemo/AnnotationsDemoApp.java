package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsDemoApp {

	public static void main(String[] args) {
		
		//Load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotations-applicationContext.xml");
		
		// Retrieve the bean from container
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		
		//Call the method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//Close the context
		context.close();

	}

}
