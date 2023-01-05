package com.luv2code.springdemo;

public class BaseballCoach implements Coach {

	private FortuneService fortuneService; // Injecting dependency on other file

	// Constructor injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	// @Override
	public String getDailyWorkout() {
		return "spend 30 mins daily on bating";
	}

	// @Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
