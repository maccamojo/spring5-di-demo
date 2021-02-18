package guru.springframework.controllers;

//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Controller;

import guru.springframework.services.GreetingService;

//@Controller
public class ConstructorInjectedController {

	//private GreetingService greetingService;    <-- this is the final version!!
	
	private final GreetingService greetingService;
	
	public ConstructorInjectedController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}

/** FINAL CODE
	public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String sayHello() {
		return greetingService.sayGreeting();
	}
*/
}
