package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	private FortuneService fortuneService; //Injecting dependency on other file

	//Constructor injection
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run 5km daily";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it:" + fortuneService.getFortune();
	}
	
	
	public void doMyStartUpStuff() {
		System.out.println("This is a startup method");
	}
	
	
	public void doMyCleanUpStuff() {
		System.out.println("This is a clean up method");
	}

}
