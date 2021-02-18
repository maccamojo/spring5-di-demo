package guru.springframework.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.services.GreetingServiceImpl;

public class SetterInjectedControllerTest {

	SetterInjectedController controller;
	
	@BeforeEach
	void setUp() {
		controller = new SetterInjectedController();  // we're mimicking what the Spring Framework would be doing, by instantiating this object
		controller.setGreetingService(new GreetingServiceImpl());  // Setters are a better way of  of doing DI
	}
	
	@Test
	void getGreeting() {
		System.out.println(controller.getGreeting());
	}
	
}
