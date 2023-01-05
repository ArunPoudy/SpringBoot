package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		//load configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrieve from bean
        CricketCoach theCoach = context.getBean("myCricketCoach",CricketCoach.class);
        
        //Call methods of bean
        
     // call method of the bean
     		System.out.println(theCoach.getDailyWorkout());
     		
     		// call another method of the bean
     		System.out.println(theCoach.getDailyFortune());
     		
     		System.out.println(theCoach.getTeamname());
     		
     		System.out.println(theCoach.getEmailaddress());
     		
       // System.out.println(theCoach.getDailyWorkout());
        
        //close context
        context.close();
	}

}
