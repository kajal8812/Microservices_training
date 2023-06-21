package com.in28minutes.learnspringframework.examples.d1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA {

}

@Component
@Lazy
class ClassB {
	ClassA ca;

	public ClassB(ClassA ca) {
		super();
		System.out.println("initialization");
		this.ca = ca;
	}

	public void doSomething() {
		System.out.println("doSomething");
	}

}

@Configuration
@ComponentScan

public class LazyInitializationLauncherApplication {

	public static void main(String[] args) {

		//var game = new SuperContraGame();
		//	var game = new MarioGame();
		//	var game = new PacmanGame();
		/*tightly coupled to mariogame .
		If i want to run supercontra or pacman game  then i need to change 
		code in runner class.*/

		//var gamerunner = new GameRunner(game);

		//gamerunner.run();

		try (var context = new AnnotationConfigApplicationContext(LazyInitializationLauncherApplication.class)) {

			System.out.println("printing");
			context.getBean(ClassB.class).doSomething();

		}
	}

}
