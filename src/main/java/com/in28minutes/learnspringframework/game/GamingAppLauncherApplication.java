package com.in28minutes.learnspringframework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.in28minutes.learnspringframework.game")
//@ComponentScan("com.in28minutes.learnspringframework.game")

public class GamingAppLauncherApplication {

	public static void main(String[] args) {

		//var game = new SuperContraGame();
		//	var game = new MarioGame();
		//	var game = new PacmanGame();
		/*tightly coupled to mariogame .
		If i want to run supercontra or pacman game  then i need to change 
		code in runner class.*/

		//var gamerunner = new GameRunner(game);

		//gamerunner.run();

		try (var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)) {

			context.getBean(GamingConsole.class).up();

			context.getBean(GameRunner.class).run();

		}
	}

}
