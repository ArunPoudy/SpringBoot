package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	private String emailaddress;
	private String teamname;
	
	
	public String getEmailaddress() {
		return emailaddress;
	}
	
	public void setEmailaddress(String emailaddress) {
		System.out.println("Cricket Coach: We are inside setter method- set email address");
		this.emailaddress = emailaddress;
	}


	public String getTeamname() {
		return teamname;
	}
	
	public void setTeamname(String teamname) {
		System.out.println("Cricket Coach: We are inside setter method- set Team name");
		this.teamname = teamname;
	}
	
	

	public CricketCoach() {
		System.out.println("We are inside no argument constructor");
	}	
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practise fast bowling for 1 hr daily";
	}

	//Setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("We are inside setter method");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
