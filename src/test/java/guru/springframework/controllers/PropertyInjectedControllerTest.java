package guru.springframework.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.services.GreetingServiceImpl;

public class PropertyInjectedControllerTest {

	PropertyInjectedController controller;
	
	@BeforeEach
	void setUp() {
		controller = new PropertyInjectedController();    // we're mimicking what the Spring Framework would be doing, by instantiating this object
		
		controller.greetingService = new GreetingServiceImpl();  // Properties are the LEAST preferred method of doing DI
	}
	
	@Test
	void getGreeting() {
		System.out.println(controller.getGreeting());
	}
	
}
