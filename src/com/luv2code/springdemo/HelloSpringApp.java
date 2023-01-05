package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		

		// load the spring Configuration file 
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class); //Load from interface
		
		// call method of the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// call another method of the bean
		System.out.println(theCoach.getDailyFortune());
		
		// close the context
		context.close();
	}

}
