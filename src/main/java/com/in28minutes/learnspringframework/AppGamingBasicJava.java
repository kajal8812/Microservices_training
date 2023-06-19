package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.PacmanGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {

		//var game = new SuperContraGame();
		//	var game = new MarioGame();
		var game = new PacmanGame();
		/*tightly coupled to mariogame .
		If i want to run supercontra or pacman game  then i need to change 
		code in runner class.*/

		var gamerunner = new GameRunner(game);

		gamerunner.run();
	}

}
