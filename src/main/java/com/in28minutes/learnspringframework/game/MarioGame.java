package com.in28minutes.learnspringframework.game;

public class MarioGame implements GamingConsole {

	public void up() {
		System.out.println("Jump");
	}

	public void down() {
		System.out.println("go into hole");
	}

	public void left() {
		System.out.println("move back");
	}

	public void right() {
		System.out.println("move front");
	}

}
