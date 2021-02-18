package guru.springframework.controllers;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.services.GreetingServiceImpl;

class ConstructorInjectedControllerTest {

	ConstructorInjectedController controller;
	
	@BeforeEach
	void setUp() {
		controller = new ConstructorInjectedController(new GreetingServiceImpl());   // we're mimicking what the Spring Framework would be doing, by instantiating this object
																					 // this is the preferred method of doing DI
	}

	@Test
	void getGreeting() {
		System.out.println(controller.getGreeting());
	}

}
