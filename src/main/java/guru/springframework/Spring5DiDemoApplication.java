package guru.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.controllers.MyController;

@SpringBootApplication
public class Spring5DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Spring5DiDemoApplication.class, args);

		MyController controller = (MyController) ctx.getBean("myController");
		// notice that I didn't create the object!
		// Spring is doing this for us, and storing it in the ApplicationContext
		// I am simply asking for an instance of this Bean
		// This is one of the fundamental tenants of Dependency Injection

		System.out.println(controller.hello());

	}
}
