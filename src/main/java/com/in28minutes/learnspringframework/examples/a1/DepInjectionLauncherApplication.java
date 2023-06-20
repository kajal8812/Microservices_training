package com.in28minutes.learnspringframework.examples.a1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class YourBusinessClass {

	@Autowired
	Dependency1 d1;

	@Autowired
	Dependency2 d2;

	/*	@Autowired
		public YourBusinessClass(Dependency1 d1, Dependency2 d2) {
			super();
			this.d1 = d1;
			this.d2 = d2;
		}
	
			@Autowired
			public void setD1(Dependency1 d1) {
				this.d1 = d1;
			}
		
			@Autowired
			public void setD2(Dependency1 d2) {
				this.d2 = d2;
			}*/

	public String toString() {
		return "using " + d1 + " and " + d2;
	}
}

@Component
class Dependency1 {

}

@Component
class Dependency2 {

}

@Configuration
@ComponentScan

public class DepInjectionLauncherApplication {

	public static void main(String[] args) {

		//var game = new SuperContraGame();
		//	var game = new MarioGame();
		//	var game = new PacmanGame();
		/*tightly coupled to mariogame .
		If i want to run supercontra or pacman game  then i need to change 
		code in runner class.*/

		//var gamerunner = new GameRunner(game);

		//gamerunner.run();

		try (var context = new AnnotationConfigApplicationContext(DepInjectionLauncherApplication.class)) {

			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

			System.out.println(context.getBean(YourBusinessClass.class));
		}
	}

}
