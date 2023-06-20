package com.in28minutes.learnspringframework.examples.a0;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan

public class SimpleSpringContextLauncherApplication {

	public static void main(String[] args) {

		//var game = new SuperContraGame();
		//	var game = new MarioGame();
		//	var game = new PacmanGame();
		/*tightly coupled to mariogame .
		If i want to run supercontra or pacman game  then i need to change 
		code in runner class.*/

		//var gamerunner = new GameRunner(game);

		//gamerunner.run();

		try (var context = new AnnotationConfigApplicationContext(SimpleSpringContextLauncherApplication.class)) {

			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

		}
	}

}
